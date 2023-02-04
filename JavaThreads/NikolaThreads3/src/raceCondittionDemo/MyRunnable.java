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
public class MyRunnable implements Runnable{
    private int count = 0;
    
    @Override
    public void run() {
        
        for (int i = 0; i < 1000000; i++) {
            synchronized(this){
                this.count++;
            }
        }
        
        System.out.println(Thread.currentThread().getName() + " : " + this.count);
    }
}
