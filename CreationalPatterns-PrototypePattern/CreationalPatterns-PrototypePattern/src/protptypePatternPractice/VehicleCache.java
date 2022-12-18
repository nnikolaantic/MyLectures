/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protptypePatternPractice;

/**
 *
 * @author anticn
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleCache {

    private final Map<String, Vehicle> registry = new HashMap<>();

    public VehicleCache() {
        Car car = new Car("Bugatti", "Chiron", "Blue", 261);
        Bus bus = new Bus("Mercedes", "Setra", "White", 48);

        registry.put("Bugatti Chiron", car);
        registry.put("Mercedes Setra", bus);
    }

    public Vehicle get(String key) {
        return registry.get(key).clone();
    }

    public void put(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            registry.put(vehicle.getBrand() + " " + vehicle.getModel(), vehicle);
        }
    }

}