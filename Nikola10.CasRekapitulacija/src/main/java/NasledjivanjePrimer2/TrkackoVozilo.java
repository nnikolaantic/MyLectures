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
public class TrkackoVozilo extends Vozilo{

    double maksimalnaBrzina = 0.0;

    void postaviMaksimalnuBrzinu(double maksimalnaBrzina) {
        this.maksimalnaBrzina = maksimalnaBrzina;
    }

    void ispisi() {
        super.ispisi();
        System.out.println("Maksimalna brzina je: " + maksimalnaBrzina);
    }

}
