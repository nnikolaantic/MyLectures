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
public class TestZaposleni {

    public static void main(String[] args) {
        KancelarijskiRadnik k = new KancelarijskiRadnik();
        Menadzer m = new Menadzer();
        m.izracunajPlatu(250);
        k.izracunajPlatu(200);
        System.out.println("Plata menadzera je: " + m.getPlata());
        System.out.println("Plata kancelarijskog radnika je: " + k.getPlata());
    }
}
