/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApstraktneKlasePrimer1;

/**
 *
 * @author Anta
 */
public abstract class Zaposleni {

    double plata;

    double getPlata() {
        return plata;
    }

    abstract void izracunajPlatu(int broj_sati);
}
