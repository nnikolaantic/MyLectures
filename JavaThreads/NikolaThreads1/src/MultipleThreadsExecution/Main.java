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
public class Main {
    public static void main(String[] args) {
        // Sve 3 niti se izvrsavaju u isto vreme i nemamo garanciju koja ce da se izvrsi prva
        for (int i = 0; i < 3; i++) {
            MultiThreading mt = new MultiThreading(i);
            mt.start();
//            try {
//                mt.join();
//            } catch (InterruptedException ex) {
//                System.out.println(ex.getLocalizedMessage());
//            }
        }
        //Niti su nezavisne jedna od druge
        throw new RuntimeException();
    }
}
