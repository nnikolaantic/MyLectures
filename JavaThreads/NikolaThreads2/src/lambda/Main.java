/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author Anta
 */
public class Main {

    public static void main(String[] args) {
        Runnable runnable = () -> {
                        String name = Thread.currentThread().getName();
                        System.out.println("Current thread is : " + name);
                        System.out.println("Lambda Runnable running");
                    };
        
//        Thread thread = new Thread(runnable);
        Thread thread = new Thread(runnable, "My Thread");
        thread.start();
    }
}
