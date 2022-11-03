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
public class MyStack {

    private Node top;

    public void push(int val) {
        Node node = new Node(val);
        //Ako je lista prazna inicijalizujemo i head i tail
        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
    }
    
    public Node pop() {
        Node pop = null;
        if (top == null) {
            System.out.println("Stack is empty!");
        }else if (top.next == null){
            System.out.println("Node with data " + top.data + " is poped!");
            pop = top;
            top = null;
        }else{
            System.out.println("Node with data " + top.data + " is poped!");
            pop = top;
            top = top.next;
        }
        return pop;
    }
    
    public Node peek(){
        System.out.println("Peek : " + top);
        return top;
    }
    
    public void display(){
        Node temp = top;
        System.out.print("TOP");
        while (temp != null) {
            System.out.print(" -> " + temp.data);
            temp = temp.next;
        }
        System.out.println(" -END");
    }
}
