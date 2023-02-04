/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anta
 */
public class MyThread extends Thread{
    
    @Override
    public void run(){
        for (int i = 10; i > 0; i--) {
            try {
                System.out.println("Thread 1 : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
            //Hajde namerno da slomimo 1 nit i da vidimo kako niti ne uticu jedna na drugu
//            System.out.println(1/0);
        }
        System.out.println("Thread 1 is finished");
    }
}
