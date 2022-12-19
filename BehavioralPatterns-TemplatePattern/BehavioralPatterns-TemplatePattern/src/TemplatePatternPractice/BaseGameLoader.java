/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplatePatternPractice;

/**
 *
 * @author anticn
 */
public abstract class BaseGameLoader {

    public void load() {
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
        cleanTempFiles();
        initializeProfiles();
    }

    abstract byte[] loadLocalData();

    abstract void createObjects(byte[] data);

    abstract void downloadAdditionalFiles();

    abstract void initializeProfiles();

//    Neke metode mozemo implementirati a neke ostaviti na subclassama da implementiraju
//    Defines the skeleton of an algorithm in the superclass but lets subclasses overide specific steps of the algorithm without changing its structure
    protected void cleanTempFiles() {
        System.out.println("Cleaning temporary files...");
        // Some Common Code...
    }

}