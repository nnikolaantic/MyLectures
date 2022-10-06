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
public class Djak extends Osoba {

    double prosecnaOcena;

    Djak(String ime, String prezime, String jmbg, double prosecnaOcena) {
        //Poziva se konstruktor nadklase 
        //koriscenjem reci "super". 
        super(ime, prezime, jmbg);
        if (prosecnaOcena <= 5 && prosecnaOcena >= 1) {
            this.prosecnaOcena = prosecnaOcena;
        } else {
            System.out.println("Greska!");
        }
    }

    @Override
    void ispisi() {
        //Pozivanje metode "ispisi" nadklase 
        //(klase Osoba) koja ce da uradi ispis
        //prva tri podatka: ime, prezime, jmbg.
        //Na ovaj nacin, kod se ne ponavlja. 
        super.ispisi();
        //Ispis prosecne ocene 
        System.out.println("Prosecna ocena: " + prosecnaOcena);
    }

}
