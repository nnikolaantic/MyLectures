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
public abstract class GeometrijskoTelo {

    private double povrsina;
    private double zapremina;

    abstract void izracunajPovrsinu();

    abstract void izracunajZapreminu();

    public double getPovrsina() {
        izracunajPovrsinu();
        return povrsina;
    }

    public double getZapremina() {
        izracunajZapreminu();
        return zapremina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public void setZapremina(double zapremina) {
        this.zapremina = zapremina;
    }
    
    
    
}
