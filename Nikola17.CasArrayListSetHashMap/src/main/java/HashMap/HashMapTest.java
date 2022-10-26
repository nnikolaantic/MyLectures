/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMap;
import java.util.*;
/**
 *
 * @author Anta
 */
public class HashMapTest {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        
//        Update
        capitalCities.put("USA", "Moscow");
        System.out.println(capitalCities);

    //    Acces item
        System.out.println(capitalCities.get("England"));

    //    Remove item
        capitalCities.remove("England");
        System.out.println(capitalCities);

    //    Remove all items 
        System.out.println(capitalCities.size());
        capitalCities.clear();
        System.out.println(capitalCities.size());
        
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println("-----------------------");
//        Loop Through a HashMap
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
           System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
        
        //HasmMape i druge strukture podataka
        
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("al1 Element1");
        al1.add("al1 Element2");
        al1.add("al1 Element3");
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("al2 Element1");
        al2.add("al2 Element2");
        al2.add("al2 Element3");
        ArrayList<String> al3 = new ArrayList<>();
        al3.add("al3 Element1");
        al3.add("al3 Element2");
        al3.add("al3 Element3");
        ArrayList<String> al4 = new ArrayList<>();
        al4.add("al4 Element1");
        al4.add("al4 Element2");
        al4.add("al4 Element3");
        ArrayList<String> al5 = new ArrayList<>();
        al5.add("al5 Element1");
        al5.add("al5 Element2");
        al5.add("al5 Element3");

        
        HashMap<String,ArrayList> myHash = new HashMap<>();
        myHash.put("al1", al1);
        myHash.put("al2", al2);
        myHash.put("al3", al3);
        myHash.put("al4", al4);
        myHash.put("al5", al5);
        
        for (String i : myHash.keySet()) {
            System.out.println("Key is : " + i);
            System.out.println("key: " + i + " value: " + myHash.get(i));
//            System.out.println("key: " + i + " value: " + myHash.get(i).get(1));
        }
    }
}
