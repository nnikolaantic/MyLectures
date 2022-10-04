/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClasses;

/**
 *
 * @author Anta
 */
public abstract class Zaposleni {
    private double plata; 
    
    public void setPlata(double plata){
        this.plata = plata;
    }
    
    public double getPlata() {
        return plata; 
    } 

    abstract void izracunajPlatu (int broj_sati);
}
