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
public interface Tree<T extends Comparable<T>> {

    Tree<T> insert(T data);

    void delete(T data);

    void traverse();

    T getMax();

    T getMin();

    boolean isEmpty();

}

