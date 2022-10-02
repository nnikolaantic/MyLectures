/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImplementsMultipleInheritance;

/**
 *
 * @author Anta
 */
public class ClassC implements InterfaceA,InterfaceB{

    @Override
    public void printA() {
        System.out.println("print A");
    }

    @Override
    public void printB() {
        System.out.println("print B");
    }
    
    public void printC(){
        System.out.println("print C");
    }
    
    
}
