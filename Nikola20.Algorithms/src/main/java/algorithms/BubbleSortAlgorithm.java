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
public class BubbleSortAlgorithm {
    public void bubbleSort(int arr[]){
        int lenght = arr.length;
        for (int i = 0; i < lenght - 1; i++){
            for (int j = 0; j < lenght - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int lowerNumber = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = lowerNumber;
                }
            }
        }
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
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        BSA.bubbleSort(arr);
        System.out.println("Sorted array");
        BSA.printArray(arr);
    }
}
