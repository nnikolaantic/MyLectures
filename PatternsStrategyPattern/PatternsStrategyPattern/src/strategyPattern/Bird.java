/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategyPattern;

/**
 *
 * @author anticn
 */
public class Bird extends Animal{
    // The constructor initializes all objects

    public Bird(){

            super();

            setSound("Tweet");

            // We set the Flys interface polymorphically
            // This sets the behavior as a non-flying Animal

            flyingType = new ItFlys();

    }

}
