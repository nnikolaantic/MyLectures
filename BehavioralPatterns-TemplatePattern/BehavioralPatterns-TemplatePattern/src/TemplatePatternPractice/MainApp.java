/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplatePatternPractice;

/**
 *
 * @author anticn
 */
public class MainApp {

    /*
     * Video Reference: https://youtu.be/cGoVDzHvD4A
     */
    public static void main(String[] args) {

        BaseGameLoader wowLoader = new WorldOfWarcraftLoader();
        wowLoader.load();

        System.out.println("==========================================");

        BaseGameLoader diabloLoader = new DiabloLoader();
        diabloLoader.load();

    }

}