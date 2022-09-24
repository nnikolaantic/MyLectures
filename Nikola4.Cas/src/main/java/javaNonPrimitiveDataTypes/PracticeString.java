/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaNonPrimitiveDataTypes;

/**
 *
 * @author Anta
 */
public class PracticeString {
    public static void main(String[] args) {
        String str = "AnaVoliMilovana"; 
        String reverseStr = "";

        int strLength = str.length();
        System.out.println(strLength);
        
//        zbog toga sto java str.lenght krece da broji od 1 a ne od nule moramo u stratu skratiti strLenght za -1
//        takodje charAt() hvata od nule sto nam isto treba
        for (int i = strLength - 1; i >=0; --i) {
//            reverseStr = reverseStr + str.charAt(i);
            reverseStr += str.charAt(i);
        }
            
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is equal to " + reverseStr);
            System.out.println(str + " is a Palindrome String.");
        }else {
            System.out.println(str + " is not equal to " + reverseStr);
            System.out.println(str + " is not a Palindrome String.");
        }
        
    }
}
