/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstraktneKlaseZadatak2;

/**
 *
 * @author Anta
 */
public class Kvadar extends GeometrijskoTelo{

    private double duzina;
    private double sirina;
    private double visina;

    double getDuzina() {
        return duzina;
    }

    void setDuzina(double duzina) {
        if (duzina > 0) {
            this.duzina = duzina;
        } else {
            System.out.println("Greska");
        }
    }

    double getSirina() {
        return sirina;
    }

    void setSirina(double sirina) {
        if (sirina > 0) {
            this.sirina = sirina;
        } else {
            System.out.println("Greska");
        }
    }

    double getVisina() {
        return visina;
    }

    void setVisina(double visina) {
        if (visina > 0) {
            this.visina = visina;
        } else {
            System.out.println("Greska");
        }
    }

    @Override
    void izracunajPovrsinu() {
        setPovrsina(2 * (duzina * sirina) + 2 * (duzina * visina) + 2 * (sirina * visina));
    }

    @Override
    void izracunajZapreminu() {
        setZapremina(duzina * visina * sirina);
    }

}
