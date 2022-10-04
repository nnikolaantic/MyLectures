/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceVSAbstractClass;

/**
 *
 * @author Anta
 */
public abstract class MuzickiUredjaj {

    private boolean ukljucen;
    private int jacinaTona = 0;

    public void ukljuci() {
        ukljucen = true;
    }

    public void iskljuci() {
        ukljucen = false;
    }

    public void pojacajTon() {
        if (jacinaTona < 40) {
            jacinaTona++;
        }
    }

    public void smanjiTon() {
        if (jacinaTona > 0) {
            jacinaTona--;
        }
    }

    public abstract void ispisi();

    public boolean isUkljucen() {
        return ukljucen;
    }

    public void setUkljucen(boolean ukljucen) {
        this.ukljucen = ukljucen;
    }

    public int getJacinaTona() {
        return jacinaTona;
    }

    public void setJacinaTona(int jacinaTona) {
        this.jacinaTona = jacinaTona;
    }
    
    
}
