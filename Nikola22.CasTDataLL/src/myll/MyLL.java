/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myll;

/**
 *
 * @author Anta
 */
public class MyLL<T> {
    Node<T> head;

    public MyLL() {
        head = null;
    }

    public void add(T val) {
        Node<T> newNode = new Node<T>(val);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<T> currentNode = this.head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

    }

    public void addLast(T v) {
        add(v);
    }

    public void display() {
        Node<T> currentNode = this.head;
        while (currentNode != null) {

            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
