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
public class Kocka extends GeometrijskoTelo {

    private double duzinaStranice;

    double getDuzinaStranice() {
        return duzinaStranice;
    }

    void setDuzinaStranice(double duzinaStranice) {
        if (duzinaStranice > 0) {
            this.duzinaStranice = duzinaStranice;
        } else {
            System.out.println("Greska");
        }
    }

    @Override
    void izracunajPovrsinu() {
        setPovrsina( duzinaStranice * duzinaStranice * 6);
    }

    @Override
    void izracunajZapreminu() {
        setZapremina(duzinaStranice * duzinaStranice * duzinaStranice);
    }

}
