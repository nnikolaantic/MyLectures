/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategyPattern;

/**
 *
 * @author anticn
 */
public class AnimalPlay {
    public static void main(String[] args){

            Animal sparky = new Dog();
            Animal tweety = new Bird();

            System.out.println("Dog: " + sparky.tryToFly());

            System.out.println("Bird: " + tweety.tryToFly());

            // This allows dynamic changes for flyingType

            sparky.setFlyingAbility(new ItFlys());

            System.out.println("Dog: " + sparky.tryToFly());

    }
}
