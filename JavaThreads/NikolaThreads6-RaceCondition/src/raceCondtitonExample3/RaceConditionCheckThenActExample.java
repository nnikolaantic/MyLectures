/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raceCondtitonExample3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Anta
 */
public class RaceConditionCheckThenActExample {
    public static void main(String[] args) {
        Map<String,String> sharedMap = new ConcurrentHashMap<>();
        
        Thread thread1 = new Thread(getRunnable(sharedMap));
        Thread thread2 = new Thread(getRunnable(sharedMap));
        
        thread1.start();
        thread2.start();
    }
    
    private static Runnable getRunnable(Map<String,String> sharedMap){
        return () -> {
            for (int i = 0; i < 1_000_000; i++) {
//                synchronized(sharedMap){
                    if (sharedMap.containsKey("key")) { // Ovde mogu da udju 2 niti u isto vreme i to nije problem
    //                     Ali nad concurrent mapom moze samo jedna od njih da pozove remove metodu
    //                     Tu onda nastaje problem
    //                     Jednoj ce biti dozvolje da uradi remove u istom momentu
    //                     Druga dobija null nazad
    //                      Dakel if iznad ovoga je critical section
                        String val = sharedMap.remove("key");
                        if (val == null) {
                            System.out.println("On iteration : " + i + " value was null");
                        }
                    }else{
                        sharedMap.put("key", "value");
                    }
                }
//            }
        };
    }
            
    
}
