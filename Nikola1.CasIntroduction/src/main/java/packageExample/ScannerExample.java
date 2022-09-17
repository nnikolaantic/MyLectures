/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageExample;

import java.util.Scanner;

/**
 *
 * @author Anta
 */

public class ScannerExample {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hey Jon are you going to a party tonight?");
        
        System.out.println("Hi David, will there be any girls?");
        
        String answer1 = scan.next();
        
        if(answer1.equals("no")){
            System.out.println("Sry David Im busy tonight");
        }else if(answer1.equals("yes")){
            System.out.println("Ooo nice, will Miley be there");
            String answer2 = scan.next();
            if(answer2.equals("no")){
                System.out.println("Sry David Im busy tonight");
            }else if(answer2.equals("yes")){
                System.out.println("Nice i realy like her, will be there 100%");
            }
        }
    }
    
}
