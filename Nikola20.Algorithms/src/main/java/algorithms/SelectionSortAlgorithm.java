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
public class SelectionSortAlgorithm {
    public void sort(int arr[]){
        int lenght = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < lenght-1; i++){
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i+1; j < lenght; j++)
                if (arr[j] < arr[minIndex])
//                    Lowest index number that we found in subarray
                    minIndex = j;
            // Swap the found minimum element with the first
            // element
            int tempMinNumber = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tempMinNumber;
        }
    }
 
    // Prints the array
    public void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    // Driver code to test above
    public static void main(String args[]){
        
        SelectionSortAlgorithm SSA = new SelectionSortAlgorithm();
        int arr[] = {64,25,12,22,11};
        SSA.sort(arr);
        System.out.println("Sorted array");
        SSA.printArray(arr);
    }    
}
