/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Anta
 */
public class MyThread extends Thread{
    
//    @Override
//    public void run(){
//        System.out.println("This thread is running");
//    }
    
    @Override
    public void run(){
        if (this.isDaemon()) {
            System.out.println("Deamon thread is running");
        }else{
            System.out.println("User thread is running");
        }
    }
    
}
