/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceZadatak;

/**
 *
 * @author Anta
 */
public class Skladiste implements SluzbaNabavke {

    int stanjeNaSkladistu = 1000;

    public void dodajRobu(int kolicina) {
        if (kolicina > 0) {
            stanjeNaSkladistu += kolicina;
        } else {
            System.out.println("Greska");
        }
    }

    public void skiniSaStanja(int kolicina) {
        if (kolicina > 0 && stanjeNaSkladistu >= kolicina) {
            stanjeNaSkladistu -= kolicina;
        } else {
            System.out.println("Greska");
        }
    }
}
