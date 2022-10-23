/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuequeStackLinkedList;


import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {       
        
//        <T> is a generic and can usually be read as "of type T"
//        Usually, you won't see "T" in there, you'll see another type. So if you see Stack<Integer> for example, that means "An Stack of Integers."
//          https://www.infoworld.com/article/2074080/core-java-jdk-7-the-diamond-operator.html diamond operator
//          Data Structure <of type T>

        Stack<Integer> stack;
        stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        
//        stack.setElementAt(10, 1);
        
        System.out.println("Stack size is " + stack.size());
        
        
        System.out.println("---------------------------------");
        System.out.println("Peek before pop : " + stack.peek());
        stack.pop();
        System.out.println("Peek after pop : " + stack.peek());
        System.out.println("----------------------------------");
        
        int n = stack.size();
        
        for (int i = 0; i < n; i++) {
            System.out.println(stack.pop());
        }  
        
            System.out.println("Da li je stack prazan : " + stack.isEmpty());
//        Ovde nam puca program zato sto smo pop-ali svaki element u stacku
//        System.out.println(stack.peek());
        
//        Zbog toga da bi smo samo prosli kroz Stack moramo da koristimo pomocnu klasu Iterator


        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
  
        // Displaying the Stack
        System.out.println("Stack: " + stack);
  
        // Creating an iterator
        Iterator value = stack.iterator();
  
        // Displaying the values
        // after iterating through the stack
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
        
    }
}
