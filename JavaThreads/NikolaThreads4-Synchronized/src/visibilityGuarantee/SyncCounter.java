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
public class SyncCounter {
    private long count = 0;
    
    public void inc(){
        synchronized(this){
            this.count++;
        }
    }
    
    public long get(){
        synchronized(this){
            return this.count;
        }
    }
    
}
