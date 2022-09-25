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
        String s = "String";
        String s1 = "StrinG";
        s.compareTo(s1);
        
//        System.out.println(s.compareTo(s1));
//        System.out.println(s.toLowerCase().compareTo(s1.toLowerCase()));
        
//        s = s.toLowerCase();
//        s1 = s1.toLowerCase();

//        if(s.compareTo(s1) == -1){
//            System.out.println("Stringovi su razliciti");
//        }else if (s.compareTo(s1) == 0){
//            System.out.println("Stringovi su isti");
//        }else{
//            System.out.println("Nesto nije u redu sa njima :(");
//        }

        uporediString(s1, s1);
        
//        Scanner scan = new Scanner(System.in);
//        scan.
        
        Animal a = new Animal();
        System.out.println("I am " + a.whoAmI + " and Im " + a.dogAge + " years old");
        a.woof();
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------");
        a.angryDog("Mnogo");
        a.happyDog();
    }
    
    public static void uporediString(String s1,String s2){
        String prviString = s1.toLowerCase();
        String drugiString = s2.toLowerCase();

        if(prviString.compareTo(drugiString) == -1){
            System.out.println("Stringovi su razliciti");
        }else{
            System.out.println("Stringovi su isti");
        }
    }
}