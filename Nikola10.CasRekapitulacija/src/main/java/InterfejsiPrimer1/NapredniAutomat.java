/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfejsiPrimer1;

/**
 *
 * @author Anta
 */
public class NapredniAutomat implements AutomatNovcaInterface {

    private double stanje = 20000.0;

    @Override
    public void uloziNovac(double iznos) {
        if (iznos > 0) {
            if (iznos <= 20000) {
                stanje += iznos;
            } else {
                System.out.println("Maksimalni iznos koji se moze uplatiti je 20000 dinara");
            }
        } else {
            System.out.println("Greska");
        }
    }

    @Override
    public void podigniNovac(double iznos) {
        if (iznos > 0 && stanje >= iznos) {
            if (iznos <= 10000) {
                stanje -= iznos;
            } else {
                System.out.println("Maksimalni iznos" + " koji se moze podici je 10000 dinara");
            }
        } else {
            System.out.println("Greska");
        }
    }

    void ispisi() {
        System.out.println("U automatu ima jos " + stanje + " dinara");
        System.out.println("Maksimalni iznos koji se moze uplatiti je 20000 dinara");
        System.out.println("Maksimalni iznos koji se moze podici je 10000 dinara");
    }

}
