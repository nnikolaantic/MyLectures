/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuequeStackLinkedList;

/**
 *
 * @author Anta
 */
public class ReverseStringStack {
    //Pravimo Stack koji ce da prima char datatype
    int size;
    int top = -1;
    char[] a;
 
    // function to check if stack is empty
    boolean isEmpty() { 
        return (top < 0); 
    }
    
    ReverseStringStack(){
        //empty constructor
    }
 
    ReverseStringStack(int n){
        size = n;
        a = new char[size];
    }
 
    // function to push element in Stack
    boolean push(char x){
        if (top >= size) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            return true;
        }
    }
 
    // function to pop element from stack
    char pop(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            char x = a[top--];
            return x;
        }
    }
    public static String reverse(String str){
        char[] charArr = str.toCharArray();
        int size = charArr.length;
        ReverseStringStack stack = new ReverseStringStack(size);

        int i;
        for(i = 0; i < size; ++i) {
            stack.push(charArr[i]);
        }

        for(i = 0; i < size; ++i) {
            charArr[i] = stack.pop();
        }
        return String.valueOf(charArr);
    }   
    
    public static void main(String[] args) {
        String s = "12345";
        
        ReverseStringStack stack = new ReverseStringStack();
//        System.out.println(stack.isEmpty());
        
        System.out.println(stack.reverse(s));
    }
}

    

