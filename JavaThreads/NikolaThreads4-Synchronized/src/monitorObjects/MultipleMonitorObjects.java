/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitorObjects;

/**
 *
 * @author Anta
 */
public class MultipleMonitorObjects {
//    Ovde imamo instancu MultipleMonitorObject
//    Ali metode unutar te instance nisu sinhronizovane na nju
//    Vec imaju posebne monitor objekte sto znaci da vise niti moze
//    Da pristupi instanci MultipleMonitoObject i da koriste njene metode
//    U isto vreme sve dok se ne poklopi da 2 niti pokusaju da pokrenu
//    metodu nad 1 monitor objektom
    
    private Object monitor1 =new Object();
    private Object monitor2 =new Object();
    
    private int counter1 = 0;
    private int counter2 = 0;
    
    public void incCounter1(){
        synchronized(this.monitor1){
            this.counter1++;
        }
    }
    public void incCounter2(){
        synchronized(this.monitor2){
            this.counter2++;
        }
    }
}
