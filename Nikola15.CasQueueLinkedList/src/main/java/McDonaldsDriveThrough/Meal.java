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
public class Meal {
    int Price;
    String Meal;
    char Size;
    int orderCount;

    public Meal() {
    }
    
    public Meal(String Meal, char Size) {
        this.Meal = Meal;
        this.Size = Size;
    }   
    public Meal(int Price, String Meal, char Size,int orderCount) {
        this.Price = Price;
        this.Meal = Meal;
        this.Size = Size;
        this.orderCount = orderCount;
    }   

    public int getPrice() {
        return Price;
    }

    public void setPrice(String Meal, char Size) {
        priceForMeal(Meal, Size);
    }

    public String getMeal() {
        return Meal;
    }

    public void setMeal(String Meal) {
        this.Meal = Meal;
    }

    public char getSize() {
        return Size;
    }

    public void setSize(char Size) {
        this.Size = Size;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }
    
    
    
    public int priceForMeal(String meal,char c){        
    int price = 0;
        if(meal.equals("BigMacMeal")){
            switch(c) {
            case 'S':
                price=400;
              break;
            case 'M':
                price=500;
              break;
            case 'L':
                price=550;
              break;
            }   
        }
        return price;
    }
    @Override
    public String toString(){
        return "Order number: " + orderCount + " | Meal is" + this.getMeal() + " | Size is:" + this.getSize() + " | Price is:" + getPrice();
    }
}
