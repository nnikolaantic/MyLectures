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
public class TestOsoba {

    public static void main(String[] args) {
        Osoba os1 = new Osoba();
        os1.setIme("Pera");
        os1.setPrezime("Peric");
        os1.setJMBG("1010980710034");
        Osoba os2 = new Osoba();
        os2.setIme("Pera");
        os2.setPrezime("Peric");
        os2.setJMBG("1010980710034");
        if (os1.equals(os2)) {
            System.out.println("U pitanju je ista osoba");
        } else {
            System.out.println("U pitanju su razlicite osobe");
        }
        System.out.println(os1);

    }
}
