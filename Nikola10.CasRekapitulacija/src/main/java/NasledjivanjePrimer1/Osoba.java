/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NasledjivanjePrimer1;

/**
 *
 * @author Anta
 */
public class Osoba {

    String ime = "N";
    String prezime = "N";
    String jmbg;

    Osoba(String ime, String prezime, String jmbg) {
        if (ime != null && prezime != null && jmbg != null) {
            this.ime = ime;
            this.prezime = prezime;
            this.jmbg = jmbg;
        } else {
            System.out.println("Greska");
        }
    }

    void ispisi() {
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("JMBG: " + jmbg);
    }

}
