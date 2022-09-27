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
public class NonPrimitiveDataTypesArray {
    public static void main(String[] args) {
        int arr[] = new int[2];
        arr[0] = 0;
        arr[1] = 1;
//        arr[2] = 2;

        System.out.println(arr);
        System.out.println(arr[0]);
        
        for (int i = 0; i < arr.length; i++){
            System.out.println("Element at index " + i + " : " + arr[i]);
        }
//        Fancy for
        for(int i : arr){
            System.out.println("Element at index " + i + " : " + arr[i]);
        }
        
        String[] strArray = {"Prvi", "Drugi", "Treci", "Cetvrti"};
        
        for(int i = 0; i < strArray.length; i++){
            System.out.println("Element at index " + i + " : " + strArray[i]);
        }
        
        int brojac = 0;
//        Fancy for
        for(String str : strArray){
//            int brojac = 0;
            System.out.println("Element at index " + brojac + " : " + str);
            brojac++;
//            brojac = ++brojac;
        }
        
        
        char[] charArray = { 'S', 't', 'r', 'i', 'n', 'g' }; 
        
        String str = String.valueOf(charArray);
        System.out.println("String out of char array " + str);
    }
}
