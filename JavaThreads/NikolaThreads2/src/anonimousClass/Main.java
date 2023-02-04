/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonimousClass;

/**
 *
 * @author Anta
 */
public class Main {

    public static void main(String[] args) {
        Runnable myRunnable = new Runnable() {
            public void run() {
                System.out.println("Runnable running");
            }
        };
        
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
