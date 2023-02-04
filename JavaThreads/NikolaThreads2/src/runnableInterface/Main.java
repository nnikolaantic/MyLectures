/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnableInterface;

/**
 *
 * @author Anta
 */
public class Main {
    public static void main(String[] args) {
//        MyRunnable myRunnable = new MyRunnable();
//        Thread myThread = new Thread(myRunnable);
//        myThread.start();

        Thread myThread = new Thread(new MyRunnable());
        myThread.start();
    }
}
