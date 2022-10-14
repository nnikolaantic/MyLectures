/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NizoviObjekataPrimer1;

/**
 *
 * @author Anta
 */
public class Test {

    public static void main(String[] args) {
        DnevnaPrognoza d = new DnevnaPrognoza(3);
        d.unesi("Beograd", 17);
        d.unesi("Novi Sad", 13);
        d.unesi("Nis", 16);
        d.ispisi();
        
//        TODO more

    }
}
