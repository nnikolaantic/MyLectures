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
public class TestAutomatNovca {

    public static void main(String[] args) {
        AutomatNovca a = new AutomatNovca();
        a.uloziNovac(3000);
        NapredniAutomat na = new NapredniAutomat();
        na.podigniNovac(9999);
        a.ispisi();
        na.ispisi();
    }
}
