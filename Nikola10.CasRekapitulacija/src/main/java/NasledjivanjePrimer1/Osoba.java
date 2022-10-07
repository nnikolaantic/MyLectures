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

    private String ime = "N";
    private String prezime = "N";
    private String jmbg;

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

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
    
    
}
