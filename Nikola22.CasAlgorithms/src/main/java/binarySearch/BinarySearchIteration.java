/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarySearch;

/**
 *
 * @author Anta
 */
public class BinarySearchIteration {
    // Returns index of x if it is present in arr[],
    // else return -1
    public int binarySearch(int arr[], int val){
        int left = 0; 
        int right = arr.length - 1;
        while (left <= right) {            
            int middle = (left + right) / 2;
            if (val < arr[middle]) { //to high
                right = middle - 1;
            }else if (val > arr[middle]) {// too low
                left = middle + 1;
            }else{//bingo
                System.out.println("Broj je pronadjen");
                return middle;
            }
        }
        System.out.println("Broj nije pronadjen");
        return -1;
    }
    public int myBinarySearch(int arr[], int x){
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {            
        int mid = (right + left) / 2;
//            int mid = left + ((right - left) / 2); sprecava overflow
            if (arr[mid] == x) {
                System.out.println("Nasli smo broj : " + x);
                return mid;
            } else if (x < arr[mid]){
                right = mid -1;
            } else{
                left = mid + 1;
            }
        }
        System.out.println("Nismo nasli broj : " + x);
        return -1;
    }
 
    // Driver method to test above
    public static void main(String args[]){
        BinarySearchIteration BSI = new BinarySearchIteration();
        int arr[] = { 2, 3, 4, 5 ,6, 7, 10, 40 };
//        int result = BSI.binarySearch(arr, 3);
        int result = BSI.myBinarySearch(arr, 44);
        System.out.println(result);
    }
}
