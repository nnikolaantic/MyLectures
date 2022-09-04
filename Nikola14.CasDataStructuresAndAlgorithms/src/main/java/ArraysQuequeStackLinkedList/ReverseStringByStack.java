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
    
    public static String reverse(String str) {
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

    public static void main(String[] args) {
        ReverseStringByStack stack = new ReverseStringByStack();
        String str = "1 - AnavoliMilovanA - 2";
        System.out.println(stack.reverse(str));
    }
}
