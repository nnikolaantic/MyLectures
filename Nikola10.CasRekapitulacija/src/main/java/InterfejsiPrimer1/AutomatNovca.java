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
public class AutomatNovca implements AutomatNovcaInterface {

    private double stanje = 5000.0;

    @Override
    public void uloziNovac(double iznos) {
        if (iznos > 0) {
            stanje += iznos;
        } else {
            System.out.println("Greska");
        }
    }

    @Override
    public void podigniNovac(double iznos) {
        if (iznos > 0 && stanje >= iznos) {
            stanje -= iznos;
        } else {
            System.out.println("Greska");
        }
    }

    void ispisi() {
        System.out.println("U automatu ima jos " + stanje + " dinara");
    }

}
