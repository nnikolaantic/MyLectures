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
public class Main {
    public static void main(String[] args) throws InterruptedException {
        SyncCounter sc = new SyncCounter();
        
        Thread thread1 = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    sc.inc();
                }
            }
        };
        
        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    sc.inc();
                }
            }
        };
        
        thread1.start();
        thread2.start();
        
        Thread.sleep(1000);
        System.out.println(sc.get());
        
    }
}
