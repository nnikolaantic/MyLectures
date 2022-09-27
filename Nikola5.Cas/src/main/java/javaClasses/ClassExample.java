/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaClasses;

import java.util.Scanner;

/**
 *
 * @author JAVA4
 */
public class ClassExample {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        System.out.println("I am " + a.whoAmI + " and Im " + a.dogAge + " years old");
        a.woof();
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------");
        a.angryDog("Mnogo");
        a.happyDog();
    }
    
}
