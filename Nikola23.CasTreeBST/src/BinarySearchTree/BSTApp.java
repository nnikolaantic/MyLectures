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
//        8, 3, 6, 10, 4, 7, 1, 14, 13

//        Node OurTreeRoot = null;
        
//        OurTreeRoot = a.insert(OurTreeRoot, 8);
        
////       OurTreeRoot = a.insert(OurTreeRoot, 3);
////       OurTreeRoot = a.insert(OurTreeRoot, 6);
////       OurTreeRoot = a.insert(OurTreeRoot, 10);
////       OurTreeRoot = a.insert(OurTreeRoot, 4);
////       OurTreeRoot = a.insert(OurTreeRoot, 7);
////       OurTreeRoot = a.insert(OurTreeRoot, 1);
////       OurTreeRoot = a.insert(OurTreeRoot, 14);
////       OurTreeRoot = a.insert(OurTreeRoot, 13);

//        a.insert(OurTreeRoot, 3);
//        a.insert(OurTreeRoot, 6);
//        a.insert(OurTreeRoot, 10);
//        a.insert(OurTreeRoot, 4);
//        a.insert(OurTreeRoot, 7);
//        a.insert(OurTreeRoot, 1);
//        a.insert(OurTreeRoot, 14);
//        a.insert(OurTreeRoot, 13);

        a.myInsert(8);
        a.myInsert(3);
        a.myInsert(6);
        a.myInsert(10);
        a.myInsert(4);
        a.myInsert(7);
        a.myInsert(1);
        a.myInsert(14);
        a.myInsert(13);
        
        
        
        System.out.println(a.root.left.left);


//        a.inorder(OurTreeRoot);
//        Ascending min to max
        System.out.println("");
        a.inorderFromRoot();
        
        System.out.println("");
        a.preorderFromRoot();
        
        System.out.println("");
        a.postorderFromRoot();
        
        System.out.println("");
        a.levelOrder();
        
        System.out.println("");
//        a.findMinMaxValue(OurTreeRoot);
        a.findMinMaxValueFromRoot();
        
        System.out.println(a.maximum);
        System.out.println(a.minimum);

        System.out.println("");
        System.out.println(a.ifNodeIsPresentFromRoot(6));
        System.out.println(a.ifNodeIsPresentFromRoot(16));
//        
//        a.deleteFromRoot(1);
        a.deleteFromRoot(3);
        a.levelOrder();
    }
}
