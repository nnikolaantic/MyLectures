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
public class CLLCRUD {

    private Node head;
    private Node tail;
    private int size = -1;

    public CLLCRUD() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        tail.next = node;
        node.prev = tail;
        size++;
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " <--> ");
                if (temp.next != null) {
                    temp = temp.next;
                }
            } while (temp != head);
        }
        System.out.println("HEAD");
    }

    public void addLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            addFirst(val);
        }
        node.prev = tail;
        tail.next = node;
        tail = node;
        head.prev = node;
        node.next = head;
        size++;
    }

    public void insert(int index, int data) {
        if (index > size) {
            System.out.println("Index ne postoji");
            return;
        }
        Node node = new Node(data);
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            node.prev = prev;
            node.next = prev.next;
            prev.next.prev = node;
            prev.next = node;
            size++;
        }

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        int data = head.data;
        if (head.next == head) {
            head = null;
            tail = null;
            size--;
        }else{
            tail.next = head.next;
            head.next.prev = tail;
            head = head.next;
            size--;
        }
        System.out.println("Node with data : " + data + " is deleted!");
    }
    
    public void deleteLast(){
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == head) {
            System.out.println("Node with data : " + head.data + " is deleted!");
            head = null;
            tail = null;
            size--;
            return;
        }
        int data = tail.data;
        tail = tail.prev;
        tail.next = head;
        head.prev = tail;
        size--;
        
        System.out.println("Node with data : " + data + " is deleted!");
    }
    
    public void delete(int index){
        if (size == -1) {
            System.out.println("List is empty!");
        }else if (index < 0 || index > size) {
            System.out.println("Index does not exist!");
        }else if (index == 0) {
            deleteFirst();
        }else if(index == size) {
            deleteLast();
        }else{
            Node nodeForDelete = head;
            for (int i = 0; i < index; i++) {
                nodeForDelete= nodeForDelete.next;
            }
            int data = nodeForDelete.data;
            
            Node nodePerv = nodeForDelete.prev;
            Node nodeNext = nodeForDelete.next;
            nodePerv.next = nodeNext;
            nodeNext.prev = nodePerv;
            size--;
            
            System.out.println("Node with data : " + data + " is deleted!");
        }
    }

    public void update(int index , Node newNode){
        if (size == -1) {
            System.out.println("List is empty!");
        }else if (index < 0 || index > size) {
            System.out.println("Index does not exist!");
        }else if(size == 0 && index == 0){
            System.out.println("Node on index "  + index + " with data " + head.data + " is updated to " + newNode.data);
            head = newNode;
            head.next = null;
            head.prev = null;
            tail = newNode;
        }else if(index == 0){
            System.out.println("Node on index "  + index + " with data " + head.data + " is updated to " + newNode.data);
            newNode.next = head.next;
            head.next.prev = newNode;
            newNode.prev = tail;
            head = newNode;
            tail.next = head;
        }else if(index == size){
            System.out.println("Node on index "  + index + " with data " + tail.data + " is updated to " + newNode.data);
            newNode.prev = tail.prev;
            tail.prev.next = newNode;
            newNode.next = head;
            tail = newNode;
            head.prev = tail;
        }else{
            Node nodeToUpdate = head;
            for (int i = 0; i < index; i++) {
                nodeToUpdate= nodeToUpdate.next;
            }
            System.out.println("Node on index "  + index + " with data " + nodeToUpdate.data + " is updated to " + newNode.data);
            
            Node nodePrev = nodeToUpdate.prev;
            Node nodeNext = nodeToUpdate.next;
            
            newNode.prev = nodePrev;
            nodePrev.next = newNode;
            newNode.next = nodeNext;
            nodeNext.prev = newNode;
            
        }
    }
}
