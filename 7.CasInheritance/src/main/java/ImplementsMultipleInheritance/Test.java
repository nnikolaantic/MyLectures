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
public class Test {
    public static void main(String[] args) {
        //Interface is abstract can not be instatiated
//        InterfaceA a = new InterfaceA();

        ClassC classC =  new ClassC();
        classC.printA();
        classC.printB();
        classC.printC();
    }
}
