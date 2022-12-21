/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerPatternExample;

/**
 *
 * @author anticn
 */
public class ObserverPatternTest {

    public static void main(String[] args) {
        DeliveryData topic = new DeliveryData();

        Observer obj1 = new Seller();
        Observer obj2 = new User();
        Observer obj3 = new DeliveryWarehouseCenter();

        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        topic.locationChanged();

        topic.unregister(obj3);

        System.out.println();
        topic.locationChanged();
    }
}
