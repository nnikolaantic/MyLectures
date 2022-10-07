/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NasledjivanjePrimer2;

/**
 *
 * @author Anta
 */
public class Vozilo {

    String naziv = "N";

    void postaviNaziv(String naziv) {
        this.naziv = naziv;
    }

    void ispisi() {
        System.out.println("Naziv vozila: " + naziv);
    }

}
