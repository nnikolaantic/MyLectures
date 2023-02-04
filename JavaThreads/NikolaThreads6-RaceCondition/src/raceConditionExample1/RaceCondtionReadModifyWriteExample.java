/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raceConditionExample1;

/**
 *
 * @author Anta
 */
//https://www.youtube.com/watch?v=RMR75VzYoos&list=PLL8woMHwr36EDxjUoCzboZjedsnhLP1j4&index=10
public class RaceCondtionReadModifyWriteExample {
    public static void main(String[] args) {
//        Counter counter = new Counter();
        CounterSynzhronized counterSync = new CounterSynzhronized();
        
//        Thread thread1 = new Thread(getRunnable(counter, "Thread1 final count "));
//        Thread thread2 = new Thread(getRunnable(counter, "Thread2 final count "));
        
        Thread thread1 = new Thread(getRunnable(counterSync, "Thread1 final count "));
        Thread thread2 = new Thread(getRunnable(counterSync, "Thread2 final count "));
        
        
//        Ovde ocekuje da barem jedna dodje do 2 miliona
//        Ali to se ne desava zbog race conditiona
        thread1.start();
        thread2.start();
    }
    
//    private static Runnable getRunnable(Counter counter,String message){
    private static Runnable getRunnable(CounterSynzhronized counter,String message){
        return () -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.incAndGet();
            }
            System.out.println(message + counter.get());
        };
    }
}
