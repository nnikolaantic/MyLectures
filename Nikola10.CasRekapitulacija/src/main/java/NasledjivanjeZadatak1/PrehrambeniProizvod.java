/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NasledjivanjeZadatak1;

import java.util.GregorianCalendar;

/**
 *
 * @author Anta
 */
public class PrehrambeniProizvod extends Proizvod{

    GregorianCalendar rokTrajanja;

    PrehrambeniProizvod() {
        super();
        this.rokTrajanja = new GregorianCalendar();
    }

    PrehrambeniProizvod(String naziv, double cena, GregorianCalendar rokTrajanja) {
        super(naziv, cena);
        if (rokTrajanja != null && rokTrajanja.after(new GregorianCalendar())) {
            this.rokTrajanja = rokTrajanja;
        } else {
            this.rokTrajanja = new GregorianCalendar();
            System.out.println("Greska");
        }
    }

}
