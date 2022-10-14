/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NizoviObjekataZadatak1;

/**
 *
 * @author Anta
 */
public class Test {

    public static void main(String[] args) {
        Parking p = new Parking(50);
        p.uvediNaParking("BG 123-456");
        p.uvediNaParking("NS 234-56");
        p.ispisi();
        p.ispisiBG();
        
//        TODO more
    }
}
