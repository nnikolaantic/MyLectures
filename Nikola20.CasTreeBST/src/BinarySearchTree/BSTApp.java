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

//    https://www.youtube.com/watch?v=JsgqnTLjfps

public class BSTApp {

    public static void main(String[] args) {
        BST a = new BST();
        Node OurTreeRoot = null;

        OurTreeRoot = a.insert(OurTreeRoot, 8);
        OurTreeRoot = a.insert(OurTreeRoot, 3);
        OurTreeRoot = a.insert(OurTreeRoot, 6);
        OurTreeRoot = a.insert(OurTreeRoot, 10);
        OurTreeRoot = a.insert(OurTreeRoot, 4);
        OurTreeRoot = a.insert(OurTreeRoot, 7);
        OurTreeRoot = a.insert(OurTreeRoot, 1);
        OurTreeRoot = a.insert(OurTreeRoot, 14);
        OurTreeRoot = a.insert(OurTreeRoot, 13);


//        a.inorder(OurTreeRoot);
        System.out.println("");
        a.inorderFromRoot();
        
        System.out.println("");
        a.preorderFromRoot();
        
        System.out.println("");
        a.postorderFromRoot();

        System.out.println("");
        a.findMinMaxValue(OurTreeRoot);
        System.out.println(a.maximum);
        System.out.println(a.minimum);

        System.out.println("");
        System.out.println(a.ifNodePresent(OurTreeRoot, 6));
        System.out.println(a.ifNodePresent(OurTreeRoot, 16));
        
        a.delete(OurTreeRoot, 1);

    }
}
