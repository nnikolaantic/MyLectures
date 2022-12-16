/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletoneWithThreads;

/**
 *
 * @author anticn
 */
public class MainApp {
    public static void main(String[] args) {
        
        System.out.println(Singleton.getInstance("Geekific"));
        Singleton singleton = Singleton.getInstance("Singleton");
        System.out.println(singleton);
        System.out.println(singleton.getData());

    }
}
