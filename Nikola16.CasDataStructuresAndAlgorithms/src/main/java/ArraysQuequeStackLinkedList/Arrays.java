/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuequeStackLinkedList;

/**
 *
 * @author Anta
 */
public class Arrays {
    public static void main(String[] args) {
        // declares an Array of String.
        String[] arr;
  
        // allocating memory for 5 integers.
        arr = new String[5];
  
        // initialize the first
        // element of the array
        arr[0] = "ELEMENT1";
  
        // initialize the second
        // element of the array
        arr[1] = "ELEMENT2";
  
        // so on...
        arr[2] = "ELEMENT3";
        arr[3] = "ELEMENT4";
        arr[4] = "ELEMENT5";
        
//        arr[3] = 0;
  
        // accessing the elements
        // of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println(
                    "Element at index " + i + " : " + arr[i]);
//            System.out.println("Ovde nisumo u for-u" + i);
        
        if(2 == 2)
            System.out.println("2 je isto sto i 2");
        else
            System.out.println("2 nije isto sto i 2");
    }
}
