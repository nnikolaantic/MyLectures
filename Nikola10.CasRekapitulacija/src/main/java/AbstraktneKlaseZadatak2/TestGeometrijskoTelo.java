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
public class TestGeometrijskoTelo {

    public static void main(String[] args) {
        Kocka ko = new Kocka();
        ko.setDuzinaStranice(25.5);
        Kvadar kv = new Kvadar();
        kv.setDuzina(20);
        kv.setSirina(10);
        kv.setVisina(30);
        System.out.println("Povrsina kocke je: " + ko.getPovrsina());
        System.out.println("Zapremina kocke je: " + ko.getZapremina());
        System.out.println("Povrsina kvadra je: " + kv.getPovrsina());
        System.out.println("Zapremina kvadra je: " + kv.getZapremina());

    }
}
