/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImplementsPreadatorPrayExample;

/**
 *
 * @author Anta
 */
public class Octopus implements Predator,Pray{

    @Override
    public void hunt() {
        System.out.println("Octopus is hunitng!!!");
    }

    @Override
    public void hide() {
        System.out.println("Octopus is hiding, shhh.");
    }
    
}
