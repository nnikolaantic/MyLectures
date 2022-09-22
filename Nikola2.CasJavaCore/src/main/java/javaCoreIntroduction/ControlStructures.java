/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCoreIntroduction;

/**
 *
 * @author Anta
 */
public class ControlStructures {
    public static void main(String[] args) {
        int i = 10;
 
//        if statement
        if (i < 15){
            System.out.println("10 is less than 15");
        }
 
        System.out.println("Outside if-block");
        // both statements will be printed
        
//        else statement
        // condition 1
        if (i == 10){
            System.out.println("i is 10\n");
        }
        // condition 2
        else if (i == 15){
            System.out.println("i is 15\n");
        }
        // condition 3
        else if (i == 20){
            System.out.println("i is 20\n");
        }
        else
            System.out.println("i is not present\n");
 
        System.out.println("Outside if-else-if");
        
  
        // Switch statement with int data type
        int day = 5;
        String dayString;
        
        switch (day) {
        case 1:
            dayString = "Monday";
            break;
        case 2:
            dayString = "Tuesday";
            break;
        case 3:
            dayString = "Wednesday";
            break;
        case 4:
            dayString = "Thursday";
            break;
        case 5:
            dayString = "Friday";
            break;
        case 6:
            dayString = "Saturday";
            break;
        case 7:
            dayString = "Sunday";
            break;
        default:
            dayString = "Invalid day";
        }
        System.out.println(dayString);
        
        // Writing a for loop
        // to print Hello World 5 times
        for (int y = 1; y <= 5; y++){
            System.out.println("Hello World" + y);
        }
        
        // Initially loop is set to run from 0-9 but we use break keyword to stop the loop at 5 
        for (int x = 0; x < 10; x++) {
            // terminate loop when i is 5.
            if (x == 5)
                break;
 
            System.out.println("i: " + x);
        }
        System.out.println("Loop complete.");
        
//        while loop 
        // initialization expression
        int j = 1;
 
        // test expression
        while (j < 6) {
            System.out.println("Hello World");
            // update expression
            j++;
        }
        
//        do while loop in java koristimo npr kad hocemo da imamo minumum 1 ispis
        // initial counter variable
        int s = 0;
 
        do {
            // Body of loop that will execute minimum
            // 1 time for sure no matter what
            System.out.println("Print statement");
            s++;
        }
        // Checking condition
        // Note: It is being checked after
        // minimum 1 iteration
        while (s < 0);
    }
    
}
