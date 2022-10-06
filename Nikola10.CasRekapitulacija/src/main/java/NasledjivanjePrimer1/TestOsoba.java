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
public class TestOsoba {

    public static void main(String[] args) {
        Osoba o = new Osoba("Pera", "Peric", "1212007710567");
        Djak dj = new Djak("Mika", "Lazic", "1010000715076", 5.0);
        Penzioner p = new Penzioner("Zika", "Zikic", "0909944710078", 23400.0);
        //Poziva se metoda "ispisi" klase Osoba. 
        o.ispisi();
        //Poziva se redefinisana metoda "ispisi" 
        //klase Djak. 
        dj.ispisi();
        //Poziva se redefinisana metoda "ispisi" 
        //klase Penzioner.
        p.ispisi();

    }
}
