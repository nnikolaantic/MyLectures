/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raceCondtitonExample2;

/**
 *
 * @author Anta
 */
public class Counter {
    private int val = 0;
    
    public int incAndGet(){
        // jedan od nacina da se ovo resi je da se ovaj deo koda napravi da bude atomic
        // Odnosno da samo 1 nit moze u datom momentu da pristupi critical section-u
        //this is critical section(a section where race condition can ocurr)
        this.val++; // this is not one instruction these are multiple instructions in JVM  operacije Read modify write
        return val;
    }
    
    
    public int get(){
        return  this.val;
    }
}
