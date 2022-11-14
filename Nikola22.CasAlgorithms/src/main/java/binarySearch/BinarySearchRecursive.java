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
public class BinarySearchRecursive {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
    int binarySearch(int arr[], int l, int r, int x){
        if (r >= l) {
            int mid = l + (r - l) / 2;
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
        // We reach here when element is not present
        // in array
        return -1;
    }
    
    public int binaryRecursive(int[] arr, int x){
        int left = 0;
        int right = arr.length - 1;
        return myBinarySearch(arr, x, left, right);
    }
    
    public int myBinarySearch(int[] arr, int x, int left, int right){
        if (left > right) {
            System.out.println("Nismo nasli broj : " + x);
            return -1;
        }
        int mid = (right + left) / 2;
//            int mid = left + ((right - left) / 2); sprecava overflow
        if (arr[mid] == x) {
            System.out.println("Nasli smo broj : " + x);
            return mid;
        } else if (x < arr[mid]) {
            return myBinarySearch(arr, x, left, mid-1);
        }else{
            return myBinarySearch(arr, x, mid + 1, right);
        }
    }
    
    // Driver method to test above
    public static void main(String args[]){
        BinarySearchRecursive ob = new BinarySearchRecursive();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
