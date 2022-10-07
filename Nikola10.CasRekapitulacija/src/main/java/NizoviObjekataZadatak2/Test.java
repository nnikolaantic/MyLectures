/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NizoviObjekataZadatak2;

/**
 *
 * @author Anta
 */
public class Test {

    public static void main(String[] args) {
        Avion a = new Avion();
        a.uvediPutnika(20, "Jovan Jovanovic", 53);
        a.uvediPutnika(30, "Milos Milosevic", 23);
        a.uvediPutnika(40, "Ana Jovanovic", 22);
        a.ispisi();
        a.ispisiJovanovice();
        System.out.println("Prosecna starost putnika je " + a.prosecnaStarost() + " godina");

        
//        TODO more
    }
}
