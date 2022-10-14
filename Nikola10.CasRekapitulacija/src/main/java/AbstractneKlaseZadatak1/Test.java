/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractneKlaseZadatak1;

/**
 *
 * @author Anta
 */
public class Test {

    public static void main(String[] args) {
        Automobil a = new Automobil();
        a.setMarka("Mercedes");
        a.setModel("E220");
        a.ispisi();
        
        System.out.println("-----------------");
        
        Avion av = new Avion();
        av.setMarka("Boeing");
        av.setModel("747");
        av.ispisi();
    }
}
