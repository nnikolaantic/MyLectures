/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuequeStackLinkedList;
import java.util.Stack;
import javax.xml.stream.events.Characters;
/**
 *
 * @author Anta
 */
public class ReverseStringByStack {
    
    public static String ReverseString(String str) {
        char[] charArr = str.toCharArray();
        int size = charArr.length;
        
        Stack<Character> stack = new Stack<>();

        int i;
        
        for(i = 0; i < size; ++i) {
            stack.push(charArr[i]);
        }

        for(i = 0; i < size; ++i) {
            charArr[i] = stack.pop();
        }

        return String.valueOf(charArr);
    }
    
//    public static String ReverseString(String str)
//    {
//        char[] reverseString = new char[str.length()];
//        // Declare a stack of type Character
//        Stack<Character> stack = new Stack<Character>();
//  
//        // Traverse the String and push the character one by
//        // one into the Stack
//        for (int i = 0; i < str.length(); i++) {
//            // push the character into the Stack
//            stack.push(str.charAt(i));
//        }
//  
//        // Now Pop the Characters from the stack until it
//        // becomes empty
//  
//        int i = 0;
//        while (!stack.isEmpty()) { // popping element until
//                                   // stack become empty
//            // get the character from the top of the stack
//            reverseString[i++] = stack.pop();
//        }
//        // return string object
//        return new String(reverseString);
//    }

    public static void main(String[] args) {
        ReverseStringByStack stack = new ReverseStringByStack();
        String str = "1 - AnavoliMilovanA - 2";
        System.out.println(stack.ReverseString(str));
    }
}
