/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classObjectConstructor;

/**
 *
 * @author Anta
 */
public class PregledKodZubara {
    //prvi korak Class
    public String imePacijenta;
    public String prezimePacijenta;
    public String vremePregleda;
    public String tipIntervencije;
    //prvi korak Class

    public PregledKodZubara() {
    }
    
    public PregledKodZubara(String imePacijenta, String prezimePacijenta, String vremePregleda, String tipIntervencije) {
        this.imePacijenta = imePacijenta;
        this.prezimePacijenta = prezimePacijenta;
        this.vremePregleda = vremePregleda;
        this.tipIntervencije = tipIntervencije;
    }
    
    public void proveriTermin(){
        System.out.println("Vreme pregleda je " + this.vremePregleda + "\npacijent koji dolazi je : " + this.imePacijenta + " " + this.prezimePacijenta
                            +   "\nIntervencija je : " + this.tipIntervencije);
    }
    
    
}
