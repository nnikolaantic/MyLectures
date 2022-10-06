/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NasledjivanjeZadatak2;

/**
 *
 * @author Anta
 */
public class Test {

    public static void main(String[] args) {
        KucniAparat k = new KucniAparat("Philips", "SQ2", true);
        Televizor t = new Televizor("LG", "LT33", false, 2);
        Radio r = new Radio("Sony", "SR", false, 88.9);
        k.iskljuci();
        t.ukljuci();
        t.promeniProgramNavise();
        r.ukljuci();
        r.setFrekvencija(105.6);
        k.ispisi();
        t.ispisi();
        r.ispisi();
    }
}
