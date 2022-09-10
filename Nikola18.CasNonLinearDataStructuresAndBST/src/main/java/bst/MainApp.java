/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author Anta
 */
public class MainApp {

    public static void main(String[] args) {

        Tree<Integer> bst = new BinarySearchTree<>();
        bst.insert(10).insert(20).insert(30).insert(40).insert(50).insert(60);
        bst.traverse();

        System.out.println("Max is: " + bst.getMax());
        System.out.println("Min is: " + bst.getMin());

        System.out.println("Deleting 60 from Tree");
        bst.delete(60);
        System.out.println("New Max is: " + bst.getMax());
        bst.traverse();

    }

}