/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NasledjivanjeZadatak2;

/**
 *
 * @author Anta
 */
public class KucniAparat {

    private String marka;
    private String model;
    private boolean ukljucen;

    KucniAparat(String marka, String model, boolean ukljucen) {
        if (marka != null && model != null) {
            this.marka = marka;
            this.model = model;
            this.ukljucen = ukljucen;
        } else {
            System.out.println("Greska");
        }
    }

    public boolean isUkljucen() {
        return ukljucen;
    }

    public void setUkljucen(boolean ukljucen) {
        this.ukljucen = ukljucen;
    }

    String getMarka() {
        return marka;
    }

    void setMarka(String marka) {
        if (marka != null) {
            this.marka = marka;
        } else {
            System.out.println("Greska");
        }
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        if (model != null) {
            this.model = model;
        } else {
            System.out.println("Greska");
        }
    }

    void ukljuci() {
        ukljucen = true;
    }

    void iskljuci() {
        ukljucen = false;
    }

    void ispisi() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        if (ukljucen) {
            System.out.println("Aparat je ukljucen");
        } else {
            System.out.println("Aparat je iskljucen");
        }
    }

}
