/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadSubclass;

/**
 *
 * @author Anta
 */
public class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread thread = new Thread() {
            public void run() {
                System.out.println("Thread Running");
            }
        };

        thread.start();
    }
}
