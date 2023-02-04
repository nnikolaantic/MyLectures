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
public class Main {

    public static void main(String[] args) {
        Object monitor1 = new Object();

//        Nikad ne koristitte String kao monitor object
        SharedMonitorObject smo1 = new SharedMonitorObject(monitor1);
        SharedMonitorObject smo2 = new SharedMonitorObject(monitor1);

        smo1.incCounter();
        smo2.incCounter();
                
        Object monitor2 = new Object();
        
        SharedMonitorObject smo3 = new SharedMonitorObject(monitor2);
        
        smo3.incCounter();
    }
}
