/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KlaseObjekitZadatak2;

/**
 *
 * @author Anta
 */
public class Osoba {

    private String ime = "N";
    private String prezime = "N";
    private String JMBG;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        if (ime != null) {
            this.ime = ime;
        } else {
            System.out.println("Greska");
        }
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setJMBG(String jmbg) {
        if (jmbg != null) {
            JMBG = jmbg;
        } else {
            System.out.println("Greska");
        }
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        if (prezime != null) {
            this.prezime = prezime;
        } else {
            System.out.println("Greska");
        }
    }

    @Override
    public String toString() {
        return "Ime osobe je: " + ime + "; Prezime osobe je: " + prezime + " JMBG: " + JMBG;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Osoba) {
            Osoba os = (Osoba) (o);
            if (ime.equals(os.getIme()) && prezime.equals(os.getPrezime()) && JMBG.equals(os.getJMBG())) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Greska");
            return false;
        }
    }
}