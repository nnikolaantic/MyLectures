/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleThreadsExecution;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anta
 */
public class MultiThreading extends Thread{
    private int threadNumber;
    
    public MultiThreading(int threadNumber){
        this.threadNumber = threadNumber;
    }
    
    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " from thred : " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
        }
    }
    
}
