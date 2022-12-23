/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgePatternPractice;

import bridgePatternPractice.abstraction.AmericanRestaurant;
import bridgePatternPractice.abstraction.ItalianRestaurant;
import bridgePatternPractice.abstraction.Restaurant;
import bridgePatternPractice.implementation.PepperoniPizza;
import bridgePatternPractice.implementation.VeggiePizza;

/**
 *
 * @author anticn
 */
public class MainApp {

    /*
     * Video Reference: https://youtu.be/88kAIisOiYs
     */
    public static void main(String[] args) {

        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();

    }

}