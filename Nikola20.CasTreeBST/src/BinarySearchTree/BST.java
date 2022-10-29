/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

import com.sun.source.tree.Tree;

/**
 *
 * @author Anta
 */
public class BST {

    int maximum = Integer.MIN_VALUE;
    int minimum = Integer.MAX_VALUE;

    Node root;

//    public void insertFromRoot(int val){
//        root = insert(root, 0);
//    }
    public Node insert(Node node, int val) {
        if (node == null) {
            if (root == null) {
                root = createNewNode(val);
                return root;
            }
            return createNewNode(val);
        }

        if (val < node.data) {
            node.left = insert(node.left, val);
        } else if ((val > node.data)) {
            node.right = insert(node.right, val);
        }

        return node;
    }

    public Node createNewNode(int val) {
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }

    public void inorderFromRoot() {
        inorder(root);
    }

    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void preorderFromRoot() {
        preorder(root);
    }

    public void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorderFromRoot() {
        postorder(root);
    }

    public void postorder(Node node) {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public void findMinMaxValue(Node node) {
        if (node == null) {
            return;
        }

        if (node.data > maximum) {
            maximum = node.data;
        }

        if (node.data < minimum) {
            minimum = node.data;
        }

        findMinMaxValue(node.left);
        findMinMaxValue(node.right);
    }

    public boolean ifNodePresent(Node node, int val) {
        if (node == null) {
            return false;
        }

        boolean isPresent = false;

        while (node != null) {
            if (val < node.data) {
                node = node.left;
            } else if (val > node.data) {
                node = node.right;
            } else {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

//    https://www.youtube.com/watch?v=JsgqnTLjfps
    public Node delete(Node node, int val) {
        if (node == null) {
            return node;
        }

        if (val < node.data) {
//            Ovde se desava delete kada se vrati null ili child noda kojeg zelimo da izbrisemo
            node.left = delete(node.left, val);
        } else if (val > node.data) {
//            Ovde se desava delete kada se vrati null ili child noda kojeg zelimo da izbrisemo
            node.right = delete(node.right, val);
        } else {
            if (node.left == null || node.right == null) {
//                Node temp = null;
//                temp = node.left == null ? node.right : node.left;
                Node temp = node.left != null ? node.left : node.right;

                if (temp == null) {
                    return null;
                } else {
                    return temp;
                }
            } else {
                Node successor = getSuccessor(node);
                node.data = successor.data;

                node.right = delete(node.right, successor.data);
                return node;
            }
        }
        return node;
    }

    public Node getSuccessor(Node node) {
        if (node == null) {
            return null;
        }

        Node temp = node.right;

        while (temp.left != null) {
            temp = temp.left;
        }

        return temp;
    }
}
