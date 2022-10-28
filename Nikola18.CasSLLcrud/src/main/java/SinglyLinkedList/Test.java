/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinglyLinkedList;

/**
 *
 * @author Anta
 */
public class Test {
    public static void main(String[] args) {
        SLLCRUD first = new SLLCRUD();
//        SLLCRUD second = new SLLCRUD();

        first.addFirst(2);
        first.addLast(1);
        first.addLast(3);
        first.addLast(5);
        first.insert(16, 2);
        first.insert(33, 16);
        first.display();
        
        System.out.println("----------------");
        System.out.println(first.getNodeValueInfo(2));
        System.out.println(first.get(2));
        System.out.println("---------------");
        
        
        System.out.println(first.find(1));
        first.display();
        first.delete(2);
        first.display();
        
        System.out.println("---------------------------------------------");
        System.out.println("test za update");
        first.display();
        Node n1 = new Node(99);
        first.update(5, n1);
        first.display();
        
//        Node n1 = new Node(111);
//        first.insertFirstNode(n1);
//        first.display();
//        
//        Node n2 = new Node(11);
//        first.updateList(n1, n2);
//        first.display();

//        second.addLast(1);
//        second.addLast(2);
//        second.addLast(9);
//        second.addLast(14);
//        second.display();
//        
        
        //Moj savet je pokazati osnovne funkcije do segmenta SORTIRANJE to posle nije bitno Merege,Buble sort itd.
//        SLLCRUD ans = SLLCRUD.merge(first, second);
//        ans.display();
//        SLLCRUD list = new SLLCRUD();
//        for (int i = 7; i > 0; i--) {
//            list.addLast(i);
//        }
//        list.display();
////        Ovde pada 
//        list.bubbleSort();
//                System.out.println("555555555555555555555555");
//        list.display();

    }

}
