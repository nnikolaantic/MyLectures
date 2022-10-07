/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfajsiIAbstraktneKlase;

/**
 *
 * @author Anta
 */
public class MuzickiStub extends MuzickiUredjaj implements CDKomponenta, RadioKomponenta {

    private double frekvencija = 87.5;
    private int brojPesme;
    private boolean ukljucenRadio;
    private boolean ukljucenCD;

    public void promeniStanicu(double frekvencija) {
        ukljucenRadio = true;
        ukljucenCD = false;
        if (frekvencija >= 87.5 && frekvencija <= 108.0) {
            this.frekvencija = frekvencija;
        } else {
            this.frekvencija = 87.5;
        }
    }

    public void pustiPesmu(int brojPesme) {
        ukljucenCD = true;
        ukljucenRadio = false;
        if (brojPesme >= 1 && brojPesme <= 21) {
            this.brojPesme = brojPesme;
        } else {
            this.brojPesme = 1;
        }
    }

    @Override
    public void ispisi() {
        if (isUkljucen()) {
            System.out.println("Muzicki stub je ukljucen");
            System.out.println("Jacina tona je: " + getJacinaTona());
            if (ukljucenRadio) {
                System.out.println("Ukljucen je radio i pusta stanicu na " + frekvencija + " MHz");
            }
            if (ukljucenCD) {
                System.out.println("Ukljucen je CD i pusta " + brojPesme + ". pesmu");
            }
        } else {
            System.out.println("Muzicki stub je iskljucen");
        }
        
    }

}
