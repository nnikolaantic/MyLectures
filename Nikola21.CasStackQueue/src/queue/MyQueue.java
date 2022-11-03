/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Anta
 */
public class MyQueue {
    private Node last;

    public void enqueue(int val) {
        Node node = new Node(val);
        //Ako je lista prazna inicijalizujemo i head i tail
        if (last == null) {
            last = node;
        } else {
            node.next = last;
            last = node;
        }
    }
    
    public Node dequeue() {
        Node dequeue = null;
        if (last == null) {
            System.out.println("Queue is empty!");
        }else if (last.next == null){
            System.out.println("Node with data " + last.data + " is dequeued!");
            dequeue = last;
            last = null;
        }else{
            Node second = last;
            while (second.next.next != null) {
                second = second.next;
            }
            dequeue = second.next;
            System.out.println("Node with data " + dequeue.data + " is dequeued!");
            second.next = null;
        }
        return dequeue;
    }
    
    public void display(){
        Node temp = last;
        System.out.print("LAST");
        while (temp != null) {
            System.out.print(" -> " + temp.data);
            temp = temp.next;
        }
        System.out.println(" -FIRST");
    }
}
