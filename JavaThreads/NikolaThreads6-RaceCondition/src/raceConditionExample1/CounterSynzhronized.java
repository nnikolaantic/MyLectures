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
public class CounterSynzhronized {
    private int val = 0;
    
    public int incAndGet(){
        synchronized(this){
            this.val++;
            return val;
        }
    }
    
    
    public int get(){
        synchronized(this){
            return  this.val;
        }
    }
}
