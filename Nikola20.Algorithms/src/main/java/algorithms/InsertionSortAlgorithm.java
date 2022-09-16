/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Anta
 */
public class InsertionSortAlgorithm {
       /*Function to sort array using insertion sort*/
    public void sort(int arr[]){
        int lenght = arr.length;
        for (int i = 1; i < lenght; ++i) {
            int key = arr[i];
            int j = i - 1;
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
////                Drugi nacin
//                int temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
                j--;
            }
            arr[j + 1] = key;
        }
    }
  
    /* A utility function to print array of size n*/
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }
  
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };
        
        InsertionSortAlgorithm ISA = new InsertionSortAlgorithm();
        ISA.sort(arr);
  
        printArray(arr);
    }
}
