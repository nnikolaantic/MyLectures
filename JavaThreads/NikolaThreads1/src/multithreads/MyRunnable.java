/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreads;

/**
 *
 * @author Anta
 */
public class MyRunnable implements Runnable{
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Thread 2 : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
        }
        System.out.println("Thread 2 is finished");
    }
}
