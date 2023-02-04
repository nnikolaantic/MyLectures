/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopThread;

/**
 *
 * @author Anta
 */
public class MyRunnableMain {

    public static void main(String[] args) {
        //Make java thread stoppable
        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);

        thread.start();

        try {
            Thread.sleep(10L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myRunnable.doStop();
        
        System.out.println("---------------------");
    }
}