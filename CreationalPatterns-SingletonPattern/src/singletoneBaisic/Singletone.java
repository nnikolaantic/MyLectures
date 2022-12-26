/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletoneBaisic;

/**
 *
 * @author anticn
 */
public class Singletone {
    private static Singletone firstInstance = null;
    
    private Singletone(){
        
    }
    
    public static Singletone getInstance(){
        if (firstInstance == null) {
            firstInstance = new Singletone(); // Lazy instatiation = if the instance is not needed it wont be created
        }
        return firstInstance;
    }
    
}
