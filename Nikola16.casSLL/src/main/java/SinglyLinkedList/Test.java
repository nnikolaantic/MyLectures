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
        SLLCRUD second = new SLLCRUD();

        first.addLast(1);
        first.addLast(3);
        first.addLast(5);

        second.addLast(1);
        second.addLast(2);
        second.addLast(9);
        second.addLast(14);
        
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
