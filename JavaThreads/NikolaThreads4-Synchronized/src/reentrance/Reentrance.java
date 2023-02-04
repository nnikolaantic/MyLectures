/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reentrance;

/**
 *
 * @author Anta
 */
public class Reentrance {
    private int count = 0;
    
    public synchronized void inc(){
        
    }
    
    public synchronized int incAndGet(){
        inc(); // this is possible because both of this methods are synchronized on same monitor object
        return this.count;
    }
    
    // Nit koja je vec usla u sunhronizovanu metodu i drzi monitor object
//    Moze da poziva druge sinhrtonizovane metode tog monitor objekta
}
