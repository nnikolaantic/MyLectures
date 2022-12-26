/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletoneBaisic;

/**
 *
 * @author anticn
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    
//    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
//    if (instance == null) {
//        synchronized (ThreadSafeSingleton.class) {
//            if (instance == null) {
//                instance = new ThreadSafeSingleton();
//            }
//        }
//    }
//    return instance;
//    }

}