/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantFactoryMethodPatternPractice;

/**
 *
 * @author anticn
 */
public class VeggieBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Creating Veggie Burger...");
        return new VeggieBurger();
    }

}