/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfejsZadatak1;

/**
 *
 * @author Anta
 */
public class Prodavnica implements SluzbaNabavke, SluzbaProdaje {

    private int brojProizvoda = 0;

    @Override
    public void dodajRobu(int kolicina) {
        if (kolicina > 0 && brojProizvoda >= kolicina) {
            brojProizvoda -= kolicina;
        } else {
            System.out.println("Greska");
        }
    }

    @Override
    public void prodajRobu(int kolicina) {
        if (kolicina > 0 && brojProizvoda >= kolicina) {
            brojProizvoda -= kolicina;
        } else {
            System.out.println("Greska");
        }
    }

    public void ispisi() {
        System.out.println("U prodavnici ima: " + brojProizvoda + " proizvoda");
    }

}
