/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

/**
 *
 * @author Anta
 */
public class Node {
    int data;
    Node next;
    Node prev;

    public Node(int val) {
        this.data = val;
    }

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Vrednost Noda je " + data;
    }
    
    
}
