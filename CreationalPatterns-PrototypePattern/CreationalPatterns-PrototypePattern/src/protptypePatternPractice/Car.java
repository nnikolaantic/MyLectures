/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protptypePatternPractice;

/**
 *
 * @author anticn
 */
public class Car extends Vehicle {

    private final int topSpeed;
//    private GpsSystem gpsSystem; Primer za deep i Shallow clone

    public Car(String brand, String model, String color, int topSpeed) {
        super(brand, model, color);
        this.topSpeed = topSpeed;
    }

    private Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
//        this.gpsSystem = car.gpsSystem; Shallow clone, because every car created from this object will referenc to the same gpsSystem object
                                        //  that means that any change on that object(gpsSystem) will reflect on both cars
//        this.gpsSystem = new GpsSystem(); This is deep clone
//                        or gpsSystem.clone();
        
    }

    @Override
    public Car clone() {
        return new Car(this);
    }

}