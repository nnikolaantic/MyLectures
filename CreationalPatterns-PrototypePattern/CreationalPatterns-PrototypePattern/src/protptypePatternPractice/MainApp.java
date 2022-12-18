/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protptypePatternPractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anticn
 */
public class MainApp {

    /*
     * Video Reference: https://youtu.be/DcFhITC9v0E
     */
    public static void main(String[] args) {
        
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("car_brand", "car_model", "car_color", 300));
        vehicles.add(new Bus("bus_brand", "bus_model", "bus_color", 8));

        List<Vehicle> copyList = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            copyList.add(vehicle.clone());
        }
        
        copyList.forEach(System.out::println);

        System.out.println("==========================================");

        VehicleCache registry = new VehicleCache();
        registry.put(vehicles);
        System.out.println(registry.get("car_brand car_model"));
        
        // Using registry to make clones
        Vehicle carClone = registry.get("Bugatti Chiron").clone();
        
        System.out.println(carClone.toString());

    }

}