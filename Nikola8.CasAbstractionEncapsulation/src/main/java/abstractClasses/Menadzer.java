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
public class Menadzer extends Zaposleni{
    @Override
    void izracunajPlatu(int broj_sati) { 
        setPlata(broj_sati * 1000); 
    }
}
