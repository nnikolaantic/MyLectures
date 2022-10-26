/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package McDonaldsDriveThrough;

/**
 *
 * @author Anta
 */
public class Order{

    private int price;
    private String meal;
    private char size;
    private int orderCount;

//    public Order() {
//    }
//
//    public Order(String Meal, char Size) {
//        this.meal = Meal;
//        this.size = Size;
//    }

    public Order(String meal, char size, int orderCount) {
        this.meal = meal;
        this.size = size;
        this.orderCount = orderCount;
        this.price = priceForMeal(meal, size);
    }

    public int priceForMeal(String meal, char size) {
        if (meal.equals("BigMacMeal")) {
            switch (size) {
                case 'S':
                    price = 400;
                    break;
                case 'M':
                    price = 500;
                    break;
                case 'L':
                    price = 550;
                    break;
            }
        }else if (meal.equals("HappyMeal")) {
            switch (size) {
                case 'S':
                    price = 350;
                    break;
                case 'M':
                    price = 450;
                    break;
                case 'L':
                    price = 500;
                    break;
            }
        }
        return price;
    }

    @Override
    public String toString() {
        return "Order number: " + orderCount + " | Meal is" + meal + " | Size is:" + size + " | Price is:" + price;
    }
}
