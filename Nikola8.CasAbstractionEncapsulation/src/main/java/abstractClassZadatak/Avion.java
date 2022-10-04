/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClassZadatak;

/**
 *
 * @author Anta
 */
public class Avion extends Vozilo{

    @Override
    boolean daLiIdePoKopnu() {
        return false;
    }

    @Override
    boolean daLiIdePoVazduhu() {
        return true;
    }

    @Override
    boolean daLiIdePoVodi() {
        return false;
    }

    @Override
    void ispisi() {
        System.out.println("U pitanju je avion");
        System.out.println("Marka aviona: " + getMarka());
        System.out.println("Model aviona: " + getModel());
    }
}
