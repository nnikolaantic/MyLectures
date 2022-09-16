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
public class HeapSortAlgorithm {
    public void sort(int arr[]){
        int lenght = arr.length;
 
        // Build heap (rearrange array)
        for (int i = lenght / 2 - 1; i >= 0; i--)
            heapify(arr, lenght, i);
 
        // One by one extract an element from heap
        for (int i = lenght - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int N, int i){
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[]){
        int N = arr.length;
 
        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver's code
    public static void main(String args[]){
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int N = arr.length;
 
        // Function call
        HeapSortAlgorithm HSA = new HeapSortAlgorithm();
        HSA.sort(arr);
 
        System.out.println("Sorted array is");
        printArray(arr);
    }
}
