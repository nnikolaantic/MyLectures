 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;

/**
 *
 * @author Anta
 */
public class BubbleSortAlgorithm {
    public void bubbleSort(int arr[]){
        long startTime = System.nanoTime();
        int n = arr.length;
        for (int i = 1; i < n; i++){
//            for (int j = 0; j < lenght - i - 1; j++){
            for (int j = 0; j < n - i; j++){
                int int1 = arr[j];
                int int2 = arr[j+1];
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
//                    ovde treba da ide higherNumber
                    int lowerNumber = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = lowerNumber;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Brzina naseg algoritma je : " + (endTime - startTime));
    }
    public void sincSort(int arr[]){
        long startTime = System.nanoTime();
        int lenght = arr.length;
        for (int i = 1; i < lenght; i++){
//            for (int j = 0; j < lenght - i - 1; j++){ videti zasto ovo smeta
            for (int j = 0; j < lenght - i; j++){
                int int1 = arr[j];
                int int2 = arr[j+1];
                if (arr[j] < arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
//                    ovde treba da ide higherNumber
                    int higherNumber = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = higherNumber;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Brzina naseg algoritma je : " + (endTime - startTime));
    }

    /* Prints the array */
    public void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[]){
        BubbleSortAlgorithm BSA = new BubbleSortAlgorithm();
        int arr[] = { 64, 34, 25, 12, 22, 11, 90, 44 , 128, 22, 1888, 1900, -1, 14, 18};
        BSA.bubbleSort(arr);
        System.out.println("Sorted array");
        BSA.printArray(arr);
        BSA.sincSort(arr);
        BSA.printArray(arr);
        

    }
}
