/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Anta
 */
public class SetExample {
    public static void main(String[] args) {
        // Demonstrating Set using HashSet
        // Declaring object of type String
        Set<String> hashSet = new HashSet<String>();
 
        // Adding elements to the Set
        // using add() method
        hashSet.add("Marija");
        hashSet.add("Janko");
        hashSet.add("Bojan");
        hashSet.add("Jovan");
        hashSet.add("Janko");
 
        // Printing elements of HashSet object
        System.out.println(hashSet);
        
        System.out.println("Contains Jovan : " + hashSet.contains("Jovan"));
        
//        Iteracija preko for each
         for (String value : hashSet)
            System.out.println(value);
        

        //Set i unija prekser i razlika skupova
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
       
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
 
         
        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);
 
        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);
 
        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
        
        
        
    }
}
