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
    }
}
