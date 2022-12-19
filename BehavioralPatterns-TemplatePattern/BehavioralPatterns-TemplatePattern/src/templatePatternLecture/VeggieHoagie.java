/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatePatternLecture;

/**
 *
 * @author anticn
 */
public class VeggieHoagie extends Hoagie {

    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    boolean customerWantsMeat() {
        return false;
    }

    boolean customerWantsCheese() {
        return false;
    }

    public void addVegetables() {
        System.out.print("Adding the Vegetables: ");
        for (String vegetable : veggiesUsed) {
            System.out.print(vegetable + " ");
        }
        System.out.println("");
    }

    public void addCondiments() {
        System.out.print("Adding the Condiments: ");
        for (String condiment : condimentsUsed) {
            System.out.print(condiment + " ");
        }
        System.out.println("");
    }

    void addMeat() {
    }

    void addCheese() {
    }

}
