/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package McDonaldsDriveThrough;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Anta
 */
public class Order {
    ArrayList<Meal> orderList = new ArrayList<>();

    public ArrayList<Meal> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Meal> orderList) {
        this.orderList = orderList;
    }
    
    public void addOrder(String OrederedMeal,char size){
        try{
            
            Meal meal = new Meal(OrederedMeal,size);
            this.orderList.add(meal);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
