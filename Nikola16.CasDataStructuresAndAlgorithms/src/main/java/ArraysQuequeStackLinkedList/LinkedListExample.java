package ArraysQuequeStackLinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
//        <T> is a generic and can usually be read as "of type T"
//        Usually, you won't see "T" in there, you'll see another type. So if you see Stack<Integer> for example, that means "An Stack of Integers."
//          https://www.infoworld.com/article/2074080/core-java-jdk-7-the-diamond-operator.html diamond operator
//          Data Structure <of type T>
        // Creating object of class linked list
        LinkedList<String> ll = new LinkedList<String>();
        
        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
        ll.add("F");
        ll.add("G");
        System.out.println("Linked list : " + ll);
  
        // Removing elements from the linked list
        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Linked list after deletion: " + ll);
  
        // Finding elements in the linked list
        boolean status = ll.contains("E");
  
        if (status)
            System.out.println(
                "List contains the element 'E' ");
        else
            System.out.println(
                "List doesn't contain the element 'E'");
  
        // Number of elements in the linked list
        int size = ll.size();
        System.out.println(
            "Size of linked list = " + size);
  
        // Get and set elements from linked list
        Object element = ll.get(2);
        System.out.println("Element returned by get() : " + element);
        
        ll.set(2, "Y");
        System.out.println("Linked list after change : " + ll);
        
        for (int i = 0; i < ll.size(); i++) {
            System.out.println("Element at index " + i + " : " + ll.get(i));
        }
    }
}
