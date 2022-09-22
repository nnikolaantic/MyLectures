/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCoreIntroduction;

import java.util.Scanner;

/**
 *
 * @author Anta
 */
public class PrimitiveDataTypes {
    public static void main(String[] args) {
//        Primitive data Types
        boolean MislimDaklePostojim = true;
//        true "true"
        byte b = 127; //10110110 ascii table 8 bita (byte sekvenca bitova, bit moze biti 1 ili 0)
        char c = 'c'; //16 bita
        
        short s = 11111; //16 bita 32767 -32768
        int i = 1111111; //32 bita
        long l = 1111111111111111111L; //64 bita
        
        float f = 20.5f; //32 bita
        double d = 20.5; //64 bita uvek koristiti double ukoliko zelite da imate precizniju racunicu     
//        float ff = 2.2;  zamislite da  su float i double kutije moguce je ubaciti manju u vecu obrnuto nije moguce
//        double dd = 2.2f;
        
//        Sve ovo mozemo staviti i u expression-e
        double x = d/s;
//        float y = d/s; pokusavasmo vecu kutiju staviti u manju
        

        int p = 2;
        int t = 5;
//        System.out.println(p += t);
        System.out.println(p = p + t);
//        System.out.println(p -= t);
        
        p++;
        ++p;
        p--;
        --p;

//        Math operators in Java
        int number1 = 3;
        int number2 = 11;
        
        int zbir = number1 + number2;
        int razlika = number1 - number2;
        int proizvod = number1 * number2;
        System.out.println(proizvod);
        
        int kolicnik1 =(int) number2 / number1;
        double kolicnik2 =(double) number2 / number1;
        
        System.out.println("-------------------");
        System.out.println(kolicnik2);
        
        Scanner scan = new Scanner(System.in);
        int prviBroj = scan.nextInt();
        int drugiBroj = scan.nextInt();
        
        System.out.println("Zbir je:");
        System.out.println(prviBroj + drugiBroj);
        
    }
}
