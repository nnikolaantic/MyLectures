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
public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public Tree<T> insert(T data) {
//        Prvi nacin light recursive way
//        if (isEmpty()){
//            root = new Node<>(data);
//        }else {
//            insert(data,root);
//        }return this; //Ovde se moze vratit i 
//                      //boolean ili void, 
//                      //this stavljamo da bi mogli da 
//                      //cejnujemo insertion call jer this 
//                      //vraca celo stablo/tree
//        Drugi nacin heavely recursive way
        root = insert(data, root);
        return this;
    }

    private Node<T> insert(T data, Node<T> node) {
        //Prvi nacin light recursive way
//        if (data.compareTo(node.getData()) < 0 ){
//            if(node.getLeftChild() == null){
//                Node<T> newNode = new Node<>(data);
//                node.setLeftChild(newNode);
//            }else{
//                insert(data, node.getLeftChild());
//            }
//        }else if (data.compareTo(node.getData()) > 0){
//            if (node.getRightChild() == null){
//                Node<T> newNode = new Node<>(data);
//                node.setRightChild(newNode);
//            }else{
//                insert(data, node.getLeftChild());
//            }
//        }

//        Drugi nacin heavely recursive way
        if (node == null) {
            return new Node<>(data);
        }
        if (data.compareTo(node.getData()) < 0) {
            node.setLeftChild(insert(data, node.getLeftChild()));
        } else if (data.compareTo(node.getData()) > 0) {
            node.setRightChild(insert(data, node.getRightChild()));
        }
        return node;
    }

    @Override
    public void delete(T data) {
        root = delete(data, root);
    }

    private Node<T> delete(T data, Node<T> node) {
        if (node == null) {
            return null;
        }
        if (data.compareTo(node.getData()) < 0) {
            node.setLeftChild(delete(data, node.getLeftChild()));
        } else if (data.compareTo(node.getData()) > 0) {
            node.setRightChild(delete(data, node.getRightChild()));
        } else {
            // One child or No children(Leaf node)
            if (node.getLeftChild() == null) {
                return node.getRightChild();
            } else if (node.getRightChild() == null) {
                return node.getLeftChild();
            }
            // Two children
            node.setData(getMax(node.getLeftChild()));
            node.setLeftChild(delete(node.getData(), node.getLeftChild()));
        }
        return node;
    }

    @Override
    public void traverse() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node<T> node) {
        if (node == null) {
            return;
        }
        //Ovde cemo iskoristiti Rekurziju I UPOTREBITI INORDER TRAVERSAL METHOD za prolaz kroz stablo
        traverseInOrder(node.getLeftChild());
        System.out.println(node);                //Ukoliko nam je potreban preorder ili postorder prolaz kroz stablo samo moramo zameniti ove 3 linije koda u odgovrajucu formu
        traverseInOrder(node.getRightChild());
    }
    
    @Override
    public T getMax() {
        if (isEmpty()) {
            return null;
        }
        //        BEZ REKURZIJE
//        Node<T> node;
//        node = root;
//        while(node.getLeftChild() != null){
//            node = node.getLeftChild();
//        }
//        return node.getData();
        return getMax(root);
    }

    private T getMax(Node<T> node) {
        if (node.getRightChild() != null) {
            return getMax(node.getRightChild());
        }
        return node.getData();
    }

    @Override
    public T getMin() {
        if (isEmpty()) {
            return null;
        }
//        BEZ REKURZIJE
//        Node<T> node;
//        node = root;
//        while(node.getLeftChild() != null){
//            node = node.getLeftChild();
//        }
//        return node.getData();
        return getMin(root);
    }

    private T getMin(Node<T> node) {
        if (node.getLeftChild() != null) {
            return getMin(node.getLeftChild());
        }
        return node.getData();
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

}