/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratoPatternLecture;

/**
 *
 * @author anticn
 */
public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {

        super(newPizza);

        System.out.println("Adding Dough");

        System.out.println("Adding Moz");
    }

    // Returns the result of calling getDescription() for
    // PlainPizza and adds " mozzarella" to it
    public String getDescription() {

        return tempPizza.getDescription() + ", mozzarella";

    }

    public double getCost() {

        System.out.println("Cost of Moz: " + .50);

        return tempPizza.getCost() + .50;

    }

}
