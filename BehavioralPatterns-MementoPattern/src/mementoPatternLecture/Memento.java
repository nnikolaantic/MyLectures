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

// Memento Design Pattern
// Used stores an objects state at a point in time
// so it can be returned to that state later. It
// simply allows you to undo/redo changes on an Object
public class Memento {

    // The article stored in memento Object
    private String article;

    // Save a new article String to the memento Object
    public Memento(String articleSave) {
        article = articleSave;
    }

    // Return the value stored in article 
    public String getSavedArticle() {
        return article;
    }

}
