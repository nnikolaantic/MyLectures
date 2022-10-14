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
public class MestoUAvionu {

    private boolean slobodno = true;
    ; private String imePrezime = null;
    private int starost = 0;

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public boolean isSlobodno() {
        return slobodno;
    }

    public void setSlobodno(boolean slobodno) {
        this.slobodno = slobodno;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public String toString() {
        if (slobodno) {
            return "Slobodno";
        } else {
            return "Ime putnika " + imePrezime + " Starost: " + starost;
        }
    }

}
