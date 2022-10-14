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
public class KancelarijskiRadnik extends Zaposleni {

    @Override
    void izracunajPlatu(int broj_sati) {
        plata = 100 * broj_sati;
    }

}
