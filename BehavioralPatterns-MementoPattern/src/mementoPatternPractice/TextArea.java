/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mementoPatternPractice;

/**
 *
 * @author anticn
 */
public class TextArea {

    private String text;

    public void set(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento takeSnapshot() {
        return new Memento(this.text);
    }

    public void restore(Memento memento) {
        this.text = memento != null ? memento.getSavedText() : null;
    }

    public static class Memento {
        private final String text;

        private Memento(String textToSave) {
            text = textToSave;
        }

        private String getSavedText() {
            return text;
        }
    }

}