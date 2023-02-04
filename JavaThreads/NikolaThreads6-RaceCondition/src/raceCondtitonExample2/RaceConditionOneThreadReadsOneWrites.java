/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raceCondtitonExample2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anta
 */
public class RaceConditionOneThreadReadsOneWrites {
    public static void main(String[] args) {
//        Ovde nema race condtiona moze da se dogodi visibility problem ali ne i Race condition
        Counter counter = new Counter();
        
        Thread thread1 = new Thread(getIncrementinRunnable(counter));
        Thread thread2 = new Thread(getReadingRunnable(counter));
        
        thread1.start();
        thread2.start();
    }
    
    private static Runnable getIncrementinRunnable(Counter counter){
        return () -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.incAndGet();
            }
            System.out.println("Thread1 final count : " + counter.get());
        };
    }
    private static Runnable getReadingRunnable(Counter counter){
        return () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getLocalizedMessage());
                }
                System.out.println("Thread2 coiunt : " + counter.get());
            }
        };
    }
}
