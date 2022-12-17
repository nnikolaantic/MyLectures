/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantFactoryMethodPatternPractice;

/**
 *
 * @author anticn
 */
public class MainApp {

    /*
     * Video Reference: https://youtu.be/EdFq_JIThqM
     */
    public static void main(String[] args) {

        Restaurant beefResto = new BeefBurgerRestaurant();
        beefResto.orderBurger();

        System.out.println("==========================================");

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();

    }

}