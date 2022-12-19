/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplatePatternPractice;

/**
 *
 * @author anticn
 */
public class WorldOfWarcraftLoader extends BaseGameLoader {

    @Override
    public byte[] loadLocalData() {
        System.out.println("Loading local WoW files...");
        // Some Warcraft Code...
        return new byte[0];
    }

    @Override
    public void createObjects(byte[] data) {
        System.out.println("Creating WoW objects...");
        // Some Warcraft Code...
    }

    @Override
    public void downloadAdditionalFiles() {
        System.out.println("Downloading WoW sounds...");
        // Some Warcraft Code...
    }

    @Override
    public void initializeProfiles() {
        System.out.println("Loading WoW profiles...");
        // Some Warcraft Code...
    }

}