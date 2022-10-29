/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLL;

/**
 *
 * @author Anta
 */
public class Test {
    public static void main(String[] args) {
        DLLCRUD dll = new DLLCRUD();
        
        dll.insertFirst(2);
        dll.insertFirst(18);
        dll.insertFirst(55);
        dll.display();

        System.out.println("-----------------------------");
        
        dll.insertLast(14);
        dll.insertLast(13);
        dll.insertLast(11);
        dll.display();
        
        System.out.println("---------------------------");
        
        dll.insert(13, 33);
        dll.display();
        
        
        System.out.println("---------------------------");
        
        
        System.out.println("Trazeni node : " + dll.find(66));
        
//        System.out.println("---------------------------");
//        dll.deleteFirst();
//        dll.deleteFirst();
//        dll.deleteFirst();
//        dll.deleteFirst();
//        dll.deleteFirst();
//        dll.deleteFirst();
//        dll.deleteFirst();
//        dll.deleteFirst();
//        dll.deleteFirst();
//        dll.deleteFirst();
//        dll.deleteFirst();
//        
//        System.out.println("----------------------------");
//        dll.deleteLast();
//        dll.deleteLast();
//        dll.deleteLast();
//        dll.deleteLast();
//        dll.deleteLast();
//        dll.deleteLast();
//        dll.deleteLast();
//        dll.deleteLast();
//        dll.deleteLast();
//
//        System.out.println("----------------------------------");
//        dll.display();
//        dll.deleteByValue(66);
//        dll.deleteByValue(2);
//        dll.deleteByValue(18);
//        dll.deleteByValue(55);
//        dll.deleteByValue(14);
//        dll.deleteByValue(13);
//        dll.deleteByValue(11);
//        dll.deleteByValue(33);
//        dll.display();
        
        System.out.println("-----------------------------");
        dll.display();
        Node newNode = new Node(333);
        dll.updateByValue(newNode, 66);
        
        dll.updateByValue(newNode, 55);
        dll.display();
    }
}
