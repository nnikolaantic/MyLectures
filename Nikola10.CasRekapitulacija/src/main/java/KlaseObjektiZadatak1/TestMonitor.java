/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KlaseObjektiZadatak1;

/**
 *
 * @author Anta
 */
public class TestMonitor {

    public static void main(String[] args) {
        Monitor m1 = new Monitor();
        m1.setMarka("Samsung");
        m1.setModel("SyncMaster 151n");
        m1.setDijagonala(15);
        Monitor m2 = new Monitor();
        m2.setMarka("Sony");
        m2.setModel("WS");
        m2.setDijagonala(17);
        if (m1.equals(m2)) {
            System.out.println("U pitanju je isti monitor");
        } else {
            System.out.println("U pitanju su razliciti monitori");
        }
        System.out.println(m1);
        System.out.println(m2);

    }
}
