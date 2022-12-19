/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplatePatternPractice;

/**
 *
 * @author anticn
 */
public class DiabloLoader extends BaseGameLoader {

    @Override
    public byte[] loadLocalData() {
        System.out.println("Loading Diablo files...");
        // Some Diablo Code...
        return new byte[0];
    }

    @Override
    public void createObjects(byte[] data) {
        System.out.println("Creating Diablo objects...");
        // Some Diablo Code...
    }

    @Override
    public void downloadAdditionalFiles() {
        System.out.println("Downloading Diablo sounds...");
        // Some Diablo Code...
    }

    @Override
    public void initializeProfiles() {
        System.out.println("Loading Diablo profiles...");
        // Some Diablo Code...
    }

}