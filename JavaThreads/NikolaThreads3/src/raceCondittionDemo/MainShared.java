/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raceCondittionDemo;

/**
 *
 * @author Anta
 */
public class MainShared {
    public static void main(String[] args) {
        
        Runnable runnable = new MyRunnable();
        
        Thread thread1 = new Thread(runnable,"Thread 1");
        Thread thread2 = new Thread(runnable,"Thread 2");
        
        thread1.start();
        thread2.start(); 
    }
}
