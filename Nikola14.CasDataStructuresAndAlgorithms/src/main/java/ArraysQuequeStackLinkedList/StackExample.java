/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuequeStackLinkedList;


import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {       

        Stack<Integer> stack;
        stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        stack.pop();
        System.out.println("Peek : " + stack.peek());
        
        int n = stack.size();
  
        for (int i = 0; i < n; i++) {
            System.out.println(stack.pop());
        }  
    }
}
