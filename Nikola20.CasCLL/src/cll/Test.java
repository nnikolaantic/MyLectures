/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cll;

/**
 *
 * @author Anta
 */
public class Test {
    public static void main(String[] args) {
        CLLCRUD cll = new CLLCRUD();
        
        cll.addFirst(14);
        cll.addFirst(11);
        cll.addFirst(22);
        cll.display();
        System.out.println("--------------------");
        
        cll.addLast(66);
        cll.addLast(77);
        cll.addLast(992);
        cll.display();
        System.out.println("-------------------");
        
        cll.insert(0, 33);
        cll.insert(6, 39);
        cll.insert(3, 44);
        cll.display();
        System.out.println("---------------------");
        
//        cll.deleteFirst();
//        cll.deleteFirst();
//        cll.deleteFirst();
//        cll.deleteFirst();
//        cll.deleteFirst();
//        cll.deleteFirst();
//        cll.deleteFirst();
//        cll.deleteFirst();
//        cll.deleteFirst();
//        cll.deleteFirst();
//        cll.deleteFirst();
//        cll.display();
//        System.out.println("----------------------");
//
//        cll.deleteLast();
//        cll.deleteLast();
//        cll.deleteLast();
//        cll.deleteLast();
//        cll.deleteLast();
//        cll.deleteLast();
//        cll.deleteLast();
//        cll.deleteLast();
//        cll.deleteLast();
//        cll.deleteLast();
//        cll.deleteLast();
//        cll.display();
//        System.out.println(cll.size);
//        System.out.println("----------------------------");
//
        cll.delete(0);
        cll.display();
        cll.delete(1);
        cll.display();
        cll.delete(2);
        cll.display();
        cll.delete(3);
        cll.display();
        cll.delete(4);
        cll.display();
        
        Node n1 = new Node(1);
        cll.update(0, n1);
        cll.display();
        
        Node n2 = new Node(2);
        cll.update(2, n2);
        cll.display();
        
        Node n3 = new Node(3);
        cll.update(3, n3);
        cll.display();
        
        cll.deleteFirst();
        cll.deleteFirst();
        
        cll.display();
        cll.update(1, n1);
        cll.display();
        
        cll.deleteFirst();
        cll.display();
        cll.update(0, n3);
        cll.display();

        
    }
}
