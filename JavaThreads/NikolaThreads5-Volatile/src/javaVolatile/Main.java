/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaVolatile;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anta
 */
public class Main {
//    https://www.youtube.com/watch?v=V2hC-g6FoGc

//    private static int counter = 0;
    private volatile static int counter = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
//            Ovo ne radi zato sto ce t1 da uskladisti couneter na CORE
//            Na kojem se izvrsava i nece imati uvid u 
//            realno stanje counter niti u promene koje pravi t2
            int local_counter = counter;

            while (local_counter < 10) {
                // Ovde ce da poredi sa vrednoscu koju ima u kes memoriji
                // A trebalo bi da cita iz main memorije
                if (local_counter != counter) {
                    System.out.println("[t1] Localcounter is changed ");
                    local_counter = counter;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            int local_counter = counter;

            while (local_counter < 10) {
                try {
                    System.out.println("[t2] Incremented counter to " + (local_counter + 1));
                    counter = local_counter++;
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getLocalizedMessage());
                }
            }
        });

        t1.start();
        t2.start();
    }
}
