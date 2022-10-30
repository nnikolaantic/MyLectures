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
public class DLLCRUD {

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node node = head;
//        Node last = null;
        while (node != null) {
            System.out.print(node.data + " -> ");
//            last = node;
            node = node.next;
        }
        System.out.println("END");

//        System.out.println("Print in reverse");
//        while (last != null) {
//            System.out.print(last.data + " -> ");
//            last = last.prev;
//        }
//        System.out.println("START");
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;
        
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }
    

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.data == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node prev = find(after);

        if (prev == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = prev.next;
        prev.next = node;
        node.prev = prev;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Lista je prazna");
            return;
        }
        int data = head.data;
        if (head.next != null) {
            head.next.prev = null;
            head = head.next;
        } else {
            head = null;
        }
        System.out.println("Node sa vrednoscu : " + data + " je izbrisan!");
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Lista je prazna");
            return;
        }
        int data = head.data;
        if (head.next != null) {
            Node secondLast = head;
            while (secondLast.next.next != null) {
                secondLast = secondLast.next;
            }
            data = secondLast.next.data;
            secondLast.next = null;
        } else {
            head = null;
        }
        System.out.println("Node sa vrednoscu : " + data + " je izbrisan!");
    }

    public void deleteByValue(int value) {
        if (find(value) == null) {
            System.out.println("Element koji zelite da izbrisete ne postoji");
        } else {
            Node nodeToDelte = find(value);
            if (nodeToDelte.next == null) {
                deleteLast();
                return;
            } else if (nodeToDelte.prev == null) {
                deleteFirst();
                return;
            }
            int data = nodeToDelte.data;
            Node prev = nodeToDelte.prev;
            Node next = nodeToDelte.next;
            prev.next = next;
            next.prev = prev;
            System.out.println("Node sa vrednoscu : " + data + " je izbrisan!");
        }
    }

    public void updateByValue(Node newNode, int value) {
        if (find(value) == null) {
            System.out.println("Element koji zelite da unapredite ne postoji");
        } else {
            Node nodeToUpdate = find(value);
            if (nodeToUpdate.next == null) {
                Node prev = nodeToUpdate.prev;
                prev.next = newNode;
                newNode.prev = prev;
                System.out.println("Node sa vrednoscu : " + value + " je unapredjen na vrednost --- > " + newNode.data);
                return;
            } else if (nodeToUpdate.prev == null) {
                Node next = nodeToUpdate.next;
                next.prev = newNode;
                newNode.next = next;
                head = newNode;
                System.out.println("Node sa vrednoscu : " + value + " je unapredjen na vrednost --- > " + newNode.data);
                return;
            }
            Node prev = nodeToUpdate.prev;
            Node next = nodeToUpdate.next;
            prev.next = newNode;
            next.prev = newNode;
            newNode.next = next;
            newNode.prev = prev;
            System.out.println("Node sa vrednoscu : " + value + " je unapredjen na vrednost --- > " + newNode.data);
        }

    }
}
