/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoryModel;

/**
 *
 * @author Anta
 */
public class SharedObject {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        
        //If we create one Runnbale and pass it to thread class constructor
        // they will share count field
//        Runnable runnable = new MyRunnable();
        Runnable runnable = new MyRunnable(myObject);
        
        Thread thread1 = new Thread(runnable,"Thread 1");
        Thread thread2 = new Thread(runnable,"Thread 2");
        
        thread1.start();
        thread2.start(); 
    }
}
