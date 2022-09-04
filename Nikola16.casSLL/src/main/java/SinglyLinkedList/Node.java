/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinglyLinkedList;

/**
 *
 * @author Anta
 */
public class Node {
    Node next;
    int data;
    
    
    public Node() {
        data = Integer.MIN_VALUE;
        next = null;
    }
    
    public Node(int d) {
        data = d;
        next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    
}
