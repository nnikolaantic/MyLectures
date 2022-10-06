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
public class TestProizvod {

    public static void main(String[] args) {
        GregorianCalendar datum = new GregorianCalendar();
        datum.set(2007, 11, 15);
        PrehrambeniProizvod p1 = new PrehrambeniProizvod("hleb", 30.0, datum);
        PrehrambeniProizvod p2 = new PrehrambeniProizvod();
        p2.setNaziv("senf");
        p2.setCena(120.5);
        System.out.println("Proizvod: " + p1.getNaziv());
        System.out.println("Cena: " + p1.getCena());
        System.out.println("Proizvod: " + p2.getNaziv());
        System.out.println("Cena: " + p2.getCena());
    }
}
