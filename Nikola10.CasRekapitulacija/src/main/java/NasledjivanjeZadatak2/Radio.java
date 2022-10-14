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
public class Radio extends KucniAparat {

    double frekvencija = 87.5;

    Radio(String marka, String model, boolean ukljucen, double frekvencija) {
        super(marka, model, ukljucen);
        if (frekvencija >= 87.5 && frekvencija <= 108) {
            this.frekvencija = frekvencija;
        } else {
            System.out.println("Greska");
        }
    }

    double getFrekvencija() {
        return frekvencija;
    }

    void setFrekvencija(double frekvencija) {
        if (frekvencija >= 87.5 && frekvencija <= 108) {
            this.frekvencija = frekvencija;
        } else {
            System.out.println("Greska");
        }
    }

    @Override
    void ispisi() {
        if (isUkljucen()) {
            System.out.println("Trenutna frekvencija je: " + frekvencija);
        } else {
            System.out.println("Radio je iskljucen");
        }
    }

}
