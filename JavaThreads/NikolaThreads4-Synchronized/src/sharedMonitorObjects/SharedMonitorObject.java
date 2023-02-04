/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharedMonitorObjects;

/**
 *
 * @author Anta
 */
public class SharedMonitorObject {
    private Object monitor = null;
    
    private int counter = 0;
    
    public SharedMonitorObject(Object monitor){
        if (monitor ==  null) {
            throw new IllegalArgumentException(
                  "Monitor object cannot be null"
            );
        }
        this.monitor = monitor;
    }
    
    public void incCounter(){
        synchronized(this.monitor){
            this.counter++;
        }
    }
}
