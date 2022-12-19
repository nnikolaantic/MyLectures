/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mementoPatternPractice;

/**
 *
 * @author anticn
 */
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import mementoPatternPractice.TextArea.Memento;

public class Editor {

    private final TextArea textArea;
    private final Deque<Memento> stateHistory;

    public Editor() {
        textArea = new TextArea();
        stateHistory = new LinkedList<>();
    }

    public void write(String text) {
        textArea.set(text);
        stateHistory.offer(textArea.takeSnapshot());
    }

    public void undo() {
        if (stateHistory.isEmpty()) {
            return;
        }
        stateHistory.pollLast();
        textArea.restore(stateHistory.peekLast());
    }

    public void printText() {
        System.out.println(textArea.getText());
    }

}