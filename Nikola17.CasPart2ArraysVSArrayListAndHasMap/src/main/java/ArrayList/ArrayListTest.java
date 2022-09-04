package ArrayList;


import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        
        // Creating an object of arraylist class
        ArrayList<String> al = new ArrayList<>();
  
        // Adding elements to ArrayList
        // Custom addition
        al.add("Geeks");
        al.add("Geeks");
        // Adding element at specific index
        al.add(1, "For");
  
        // Printing all elements of ArrayList
        System.out.println("Initial ArrayList " + al);
  
        // Removing element from above ArrayList
        al.remove(1);
  
        // Printing the updated Arraylist elements
        System.out.println("After the Index Removal " + al);
  
        // Removing this word element in ArrayList
        al.remove("Geeks");
  
        // Now printing updated ArrayList
        System.out.println("After the Object Removal " + al);
        
        
        // Using the Get method and the
        // for loop
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
  
        System.out.println();
  
        // Using the for each loop
        for (String str : al)
            System.out.print(str + " ");
    }
    
}
