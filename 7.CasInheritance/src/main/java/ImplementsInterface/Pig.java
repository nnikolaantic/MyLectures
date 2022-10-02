/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImplementsInterface;

/**
 *
 * @author Anta
 */
public class Pig implements Animal{
    
    @Override
    public void animalSound() {
        System.out.println("Ja sam Tata prase");
    }

    @Override
    public void sleep() {
        System.out.println("Spavam");
    }

}
