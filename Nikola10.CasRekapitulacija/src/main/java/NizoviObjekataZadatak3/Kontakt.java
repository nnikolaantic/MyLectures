/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NizoviObjekataZadatak3;

/**
 *
 * @author Anta
 */
public class Kontakt {

    private String imePrezime = null;
    private String adresa = null;
    private int telefon = 0;

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        if (imePrezime == null) {
            System.out.println("Ime i prezime ne mogu biti null");
        } else {
            this.imePrezime = imePrezime;
        }
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        if (adresa == null) {
            System.out.println("Adresa ne moze biti null");
        } else {
            this.adresa = adresa;
        }
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        if (telefon <= 0) {
            System.out.println("Uneti telefon mora biti veci od nule");
        } else {
            this.telefon = telefon;
        }
    }

    public String toString() {
        return "Ime i prezime: " + imePrezime + " Adresa: " + adresa + " Telefon: " + telefon;
    }
}
