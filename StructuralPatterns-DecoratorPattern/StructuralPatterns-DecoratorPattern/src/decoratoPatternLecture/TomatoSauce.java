/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratoPatternLecture;

/**
 *
 * @author anticn
 */
public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Sauce");
    }

    // Returns the result of calling getDescription() for
    // PlainPizza, Mozzarella and then TomatoSauce
    public String getDescription() {

        return tempPizza.getDescription() + ", tomato sauce";

    }

    public double getCost() {

        System.out.println("Cost of Sauce: " + .35);

        return tempPizza.getCost() + .35;

    }

}
