/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author Anta
 */
public class Node {
    int data;
    Node left;
    Node right;

    @Override
    public String toString() {
        return "Node data is " + data;
    }

    public Node() {
    }
    
    public Node(int data) {
        this.data = data;
    }
    
}


