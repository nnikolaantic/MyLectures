/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLL;

/**
 *
 * @author Anta
 */
public class CLLCRUD {
    private Node head;
    private Node tail;

    public CLLCRUD() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " -> ");
                if (temp.next != null) {
		    temp = temp.next;
		}
            } while (temp != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int data) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.data == data) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.data == data) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }
}
