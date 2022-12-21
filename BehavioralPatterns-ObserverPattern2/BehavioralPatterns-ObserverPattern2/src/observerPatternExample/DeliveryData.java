/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerPatternExample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anticn
 */
public class DeliveryData implements Subject {

    private List<Observer> observers;
    private String location;

    public DeliveryData() {
        this.observers = new ArrayList<>();
    }
    
    // List where we will store our observers
    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer obj : observers) {
            obj.update(location);
        }
    }

    public void locationChanged() {
        this.location = getLocation();
        notifyObservers();
    }

    public String getLocation() {
        return "YPlace";
    }

}
