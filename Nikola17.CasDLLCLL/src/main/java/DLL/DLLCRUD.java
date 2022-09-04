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
public class DLLCRUD {
    private Node head;

    public void insertFirst(int data) {
        Node node = new Node(data);
        if(head == null){
           head = node;
//            node.prev = null;
//            node.next = null;
        }
        head.prev = node;
        node.next = head;
        node.prev = null; 
        head = node;
    }

    public void insertLast(int data) {
        Node node = new Node(data);

        if (head == null) {
//            node.prev = null;
//            node.next = null;
//            head = node;
            insertFirst(data);
            return;
        }
        
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
        
        node.next = null;
    }
    
    public Node find(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    
    public void insert(int after, int data) {
        Node temp = find(after);

        if (temp == null) {
            System.out.println("After does not exist");
            return;
        }

        Node node = new Node(data);
        
        if (temp.next != null) {
            temp.next.prev = node;
        }
        
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        
    }
    
    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.data + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }


}
