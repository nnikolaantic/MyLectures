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
public class PracticeArray {
    public static void main(String[] args) {
        
        //1.Zadatak napisati algoritam koji ce sabrati sve vrednosti u array-u
        int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
//        System.out.println(myArray.length);

//        for (int i : my_array)
        for (int i = 0; i <= myArray.length - 1 ; i++){
            System.out.println(myArray[i]);
            sum += myArray[i];
        }
        System.out.println("The sum is " + sum);
        //-------------------------------------------
        
//        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int sum = 0;
//
//        for (int i : my_array)
//            sum += i;
//        System.out.println("The sum is " + sum);
        
//        Napravi array stringova, prodji kroz nji i ispisi njene vrednosti
        String[] stringArr = new String[7];
        stringArr[0] = "ponedeljak";
        stringArr[1] = "utorak";
        stringArr[2] = "sreda";
        stringArr[3] = "cetvrtak";
        stringArr[4] = "petak";
        stringArr[5] = "subota";
        stringArr[6] = "nedelja";
        
        for(String dan : stringArr){
            System.out.println(dan);
        }
        
        
//        Pronadji specificnu vrednost u arrayu
        int[] myArray1 = {
        1789, 2035, 1899, 1456, 2013, 
        1458, 2458, 1254, 1472, 2365, 
        1456, 2265, 1457, 2456};

        int trazeniBroj = 123123; 

        for (int n : myArray1) {
            if (trazeniBroj == n) {
                System.out.println("myArray1 sadzri trazenu vrednost : " + trazeniBroj );
            }  
        }
                // declaring and initializing 2D array
        int arr[][]
            = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
  
        // printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
  
            System.out.println();
        }
    }
}
