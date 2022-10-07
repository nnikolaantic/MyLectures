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
public class Penzioner extends Osoba {

    private double penzija;

    Penzioner(String ime, String prezime, String jmbg, double penzija) {
        super(ime, prezime, jmbg);
        if (penzija > 0) {
            this.penzija = penzija;
        } else {
            System.out.println("Greska!");
        }
    }

    @Override
    void ispisi() {
        //Ne vrsi se poziv metodi "ispisi" 
        //nadklase jer ona ispisuje i jmbg 
        //a to u ovom slucaju nije potrebno. 
        System.out.println("Ime: " + getIme());
        System.out.println("Prezime: " + getPrezime());
        System.out.println("Penzija: " + penzija);
    }

}
