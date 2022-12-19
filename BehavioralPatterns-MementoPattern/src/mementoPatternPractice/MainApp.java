/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mementoPatternPractice;

/**
 *
 * @author anticn
 */
public class MainApp {

    /*
     * Video Reference: https://youtu.be/_Q5rXfGuyLQ
     */
    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.write("Like and");
        editor.printText();
        editor.write("Like and Subscribe");
        editor.printText();
        editor.write("Like and Subscribe to Geekific!");
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
    }

}