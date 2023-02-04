/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visibilityGuarantee;

/**
 *
 * @author Anta
 */
public class Main2 {

    public static void main(String[] args) {
        SyncCounterUnSunchronized counter = new SyncCounterUnSunchronized();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.inc();
            }
            System.out.println(counter.get());
        });
        
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.inc();
            }
            System.out.println(counter.get());
        });
        
        thread1.start();
        thread2.start();
    }
}
