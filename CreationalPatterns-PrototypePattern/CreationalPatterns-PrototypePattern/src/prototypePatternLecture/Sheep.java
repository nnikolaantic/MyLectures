/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototypePatternLecture;

/**
 *
 * @author anticn
 */
public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep is Made");
    }

    public Animal makeCopy() {
        System.out.println("Sheep is Being Made");

        Sheep sheepObject = null;

        try {
            // Calls the Animal super classes clone()
            // Then casts the results to Sheep
            sheepObject = (Sheep) super.clone();
        } // If Animal didn't extend Cloneable this error 
        // is thrown
        catch (CloneNotSupportedException e) {
            System.out.println("The Sheep was Turned to Mush");
            e.printStackTrace();
        }
        return sheepObject;
    }

    public String toString() {
        return "Dolly is my Hero, Baaaaa";
    }

}
