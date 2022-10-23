/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuequeStackLinkedList;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Anta
 */
public class ExtendedStack extends Stack {
    
    @Override
    public String peek(){
        System.out.println("Moja verzija peek-a");
        return "Peek @Overide : " + elementAt(size() - 1);       
    }
    
    public void peekAll(ExtendedStack es){
        // Creating an iterator
        Iterator value = es.iterator();
  
        // Displaying the values
        // after iterating through the stack
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
    
    public static void main(String[] args) {
        
        ExtendedStack es = new ExtendedStack();
        Arrays a = new Arrays(); 
        
        es.push(1);
        es.push(2);
        es.push(3);
        es.push(4);
//        es.push("5");
//        es.push(a);
        
        System.out.println("Stack peek " + es.peek());
        es.peekAll(es);
        
    }
}
