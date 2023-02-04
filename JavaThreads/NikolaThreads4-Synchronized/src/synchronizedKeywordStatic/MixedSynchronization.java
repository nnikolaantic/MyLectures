/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizedKeywordStatic;

/**
 *
 * @author Anta
 */
public class MixedSynchronization {
    // Za ovo je monitor object class
    public static Object staticObj = null;
    
    public static synchronized void setStaticObj(Object obj){
        staticObj = obj;
    }
    
    // Za ovo je monitor object instanca
    public Object instanceObj = null;
    
    public synchronized void setInstanceObj(Object obj){
        this.instanceObj = obj;
    }
    
//    Tako da se ove dve metode mogu zvati u isto vreme od strane vise niti
}
