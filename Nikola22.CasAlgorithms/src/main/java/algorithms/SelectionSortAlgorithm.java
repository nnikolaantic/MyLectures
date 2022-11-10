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

//https://www.youtube.com/watch?v=GUDLRan2DWM
//https://www.youtube.com/watch?v=g-PGLbMth_g&t=80s
//https://www.geeksforgeeks.org/selection-sort/?ref=lbp

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
    
    public void mySelectionSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                int intJ = arr[j];
                int minIndx = arr[minIndex];
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //Trenutni najmanji broj
            int tempMinNumber = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tempMinNumber;
        }
    }
    
    public void mySelectionSortMaxToMin(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            //Trenutni najveci broj
            int tempMaxNumber = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = tempMaxNumber;
        }
    }
    
    public void mySelectionArrayList(ArrayList<Integer> al){
        int n = al.size();
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (al.get(j) < al.get(minIndex)) {
                    minIndex = j;
                }
            }
            //Trenutni najmanji broj
            int tempMinNumber = al.get(minIndex);
            al.set(minIndex, al.get(i));
            al.set(i, tempMinNumber);
        }
    }
 
    // Prints the array
    public void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public void printArrayList(ArrayList<Integer> al){
        int n = al.size();
        for (int i=0; i<n; ++i)
            System.out.print(al.get(i) + " ");
        System.out.println();
    }
 
    // Driver code to test above
    public static void main(String args[]){
        
        SelectionSortAlgorithm SSA = new SelectionSortAlgorithm();
//        int arr[] = {64,25,12,22,11};
//        SSA.sort(arr);
//        System.out.println("Sorted array");
//        SSA.printArray(arr);
        
        System.out.println("-------------------");
//        int arr2[] = {2,8,5,3,9,4,1};
        int arr2[] = {2,7,4,1,5,3};
        SSA.mySelectionSort(arr2);
        System.out.println("Sorted array");
        SSA.printArray(arr2);
        System.out.println("Max to min--------------");
        SSA.mySelectionSortMaxToMin(arr2);
        SSA.printArray(arr2);
        System.out.println("Selection Sort with ArrayList");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(14);
        al.add(66);
        al.add(3);
        al.add(99);
        al.add(-1);
        SSA.mySelectionArrayList(al);
        SSA.printArrayList(al);
    }    
}
