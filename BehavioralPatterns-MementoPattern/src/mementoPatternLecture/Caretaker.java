/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mementoPatternLecture;

/**
 *
 * @author anticn
 */
// Memento Design Pattern Tutorial
import java.util.ArrayList;

public class Caretaker {

    // Where all mementos are saved
    ArrayList<Memento> savedArticles = new ArrayList<Memento>();

    // Adds memento to the ArrayList
    public void addMemento(Memento m) {
        savedArticles.add(m);
    }

    // Gets the memento requested from the ArrayList
    public Memento getMemento(int index) {
        return savedArticles.get(index);
    }
}
