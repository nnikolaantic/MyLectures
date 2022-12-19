/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatePatternLecture;

/**
 *
 * @author anticn
 */
public class ItalianHoagie extends Hoagie {

    String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
    String[] cheeseUsed = {"Provolone"};
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    public void addMeat() {
        System.out.print("Adding the Meat: ");
        for (String meat : meatUsed) {
            System.out.print(meat + " ");
        }
        System.out.println("");
    }

    public void addCheese() {
        System.out.print("Adding the Cheese: ");
        for (String cheese : cheeseUsed) {
            System.out.print(cheese + " ");
        }
        System.out.println("");
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
}
	
	/*
	public void makeSandwich(){
		cutBun();
		addMeat();
		addCheese();
		addVegetables();
		addCondiments();
		wrapTheHoagie();
	}
	
	public void cutBun(){
		System.out.println("The Hoagie is Cut");
	}
	
	public void addMeat(){
		System.out.println("Add Salami, Pepperoni and Capicola ham");
	}
	
	public void addCheese(){
		System.out.println("Add Provolone");
	}
	
	public void addVegetables(){
		System.out.println("Add Lettuce, Tomatoes, Onions and Sweet Peppers");
	}
	
	public void addCondiments(){
		System.out.println("Add Oil and Vinegar");
	}
	
	public void wrapTheHoagie(){
		System.out.println("Wrap the Hoagie");
	}
	
}
	*/
