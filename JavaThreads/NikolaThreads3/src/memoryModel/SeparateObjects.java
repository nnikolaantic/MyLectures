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
public class SeparateObjects {
    public static void main(String[] args) {
        
        MyObject myObject = new MyObject();
        
        int myLocalVar = 0;
        String myLocalString = "";
        
//        Runnable runnable1 = new MyRunnable();
//        Runnable runnable2 = new MyRunnable();
        Runnable runnable1 = new MyRunnable(myObject);
        Runnable runnable2 = new MyRunnable(myObject);
        
        Thread thread1 = new Thread(runnable1,"Thread 1");
        Thread thread2 = new Thread(runnable2,"Thread 2");
        
        thread1.start();
        thread2.start(); 
    }
    
}
