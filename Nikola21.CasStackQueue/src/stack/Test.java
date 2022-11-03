/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Anta
 */
public class Test {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        
        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);
        ms.push(5);
        ms.push(6);
        
        ms.display();
        ms.peek();
        
        
        ms.pop();
        ms.pop();
        ms.pop();
        ms.pop();
        ms.pop();
        ms.pop();
        
        Node n1 = ms.pop();
        System.out.println(n1);
        
        ms.display();
        
        ms.peek();
        
        ms.push(2);
        ms.peek();
        ms.display();
    }
}
