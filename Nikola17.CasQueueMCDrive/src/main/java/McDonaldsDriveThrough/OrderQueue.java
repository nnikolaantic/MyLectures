/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package McDonaldsDriveThrough;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Anta
 */
public class OrderQueue{
    private int orderNumber;
    
    private Queue<Order> orderQueue = new LinkedList<>();

    public void addOrder(String orederedMeal,char size){
        Order order = new Order(orederedMeal, size, orderNumber);
        this.orderQueue.add(order);
    }
    
    public String deliverOrder(){
        return orderQueue.remove().toString();
    }

    public void orderNumberCount() {
        orderNumber++;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Queue<Order> getOrderQueue() {
        return orderQueue;
    }
    
    
    
}
