/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerPatternExample;

/**
 *
 * @author anticn
 */
public interface Subject {

    void register(Observer obj);

    void unregister(Observer obj);

    void notifyObservers();
}
