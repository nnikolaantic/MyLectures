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
public class Node<T> {

    T data;
    Node<T> next;

    public Node(T d) {
        this.data = d;
        this.next = null;
    }

}
