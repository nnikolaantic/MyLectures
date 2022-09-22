/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCoreIntroduction;

/**
 *
 * @author Anta
 */
public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
//        Non-primitive data Types
        String str = "string"; //reusing the same object
        System.out.println("Ovo je nas string " + str);
        String str1 = new String("String"); //creating a new objcet
        System.out.println(str1);
        System.out.println(str1.toLowerCase());
        
        int arr[] = new int[2];
        arr[0] = 0;
        arr[1] = 1;
//        arr[2] = 2;

        System.out.println(arr);
        System.out.println(arr[0]);
        
    }
}
