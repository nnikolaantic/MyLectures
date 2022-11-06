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
public class Test {
    public static void main(String[] args) {
        MyLL<Integer> myll = new MyLL<Integer>();
        myll.add(10);
        myll.add(20);
        myll.add(30);
        myll.addLast(40);
        System.out.println("===LIST=====");
        myll.display();
    }
}
