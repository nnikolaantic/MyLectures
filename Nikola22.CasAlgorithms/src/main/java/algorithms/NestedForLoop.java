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
public class NestedForLoop {

    public static void main(String[] args) {

        // outer loop prints weeks
        for (int week = 1; week <= 3; week++) {
            System.out.println("Week: " + week);

            // inner loop prints days
            for (int day = 1; day <= 7; ++day) {
                System.out.println("  Day: " + day);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("---------------------------------------");
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + " |  j = " + j);
            }
        }
        
        int[] arr = {1,2,3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("------------------------------");
            for (int j = 0; j < arr.length; j++) {
                System.out.println("i = " + arr[i] + " |  j = " + arr[j]);
            }
        }

//        int[][] array = {{1, 2, 3}, {4, 5, 6}};
//        for (int row = 0; row < array.length; row++) {
//            for (int col = 0; col < array[0].length; col++) {
//                System.out.println(array[row][col]);
//            }
//        }
    }
}
