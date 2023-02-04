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
public class SyncCounterUnSunchronized {

    private long count = 0;

    public synchronized void inc() {
        this.count++;
    }

//    public long get() {
    public synchronized long get() {
        return this.count;
    }

}
