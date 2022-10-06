/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NizoviObjekataPrimer1;

/**
 *
 * @author Anta
 */
public class DnevnaPrognoza {

    private TemperaturaMesta[] temperature;
//    private TemperaturaMesta[] temperature = new TemperaturaMesta[6];

    public DnevnaPrognoza(int brojMesta) {
        if (brojMesta > 0) {
            temperature = new TemperaturaMesta[brojMesta];
        } else {
            temperature = new TemperaturaMesta[10];
            System.out.println("Greska");
        }
        // Pojedinacna inicijalizacija svakog 
        // elementa niza. 
        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = new TemperaturaMesta();
        }
    }

    public boolean imaSlobodnihMesta() {
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i].getNaziv().equals("nepoznat")) {
                return true;
            }
        }
        return false;
    }

    public void unesi(String naziv, int temperatura) {
        if (!imaSlobodnihMesta()) {
            System.out.println("Nema slobodnih mesta");
        } else {
            for (int i = 0; i < temperature.length; i++) {
                if (temperature[i].getNaziv().equals("nepoznat")) {
                    temperature[i].setNaziv(naziv);
                    temperature[i].setTemperatura(temperatura);
                    break;
                }
            }
        }
    }

    public void izbaci(String naziv) {
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i].getNaziv().equals(naziv)) {
                temperature[i].setNaziv("nepoznat");
                temperature[i].setTemperatura(0);
                break;
            }
        }
    }

    public void ispisi() {
        for (int i = 0; i < temperature.length; i++) {
            System.out.println("Mesto: " + temperature[i].getNaziv() + " Temperatura: " + temperature[i].getTemperatura());
        }
    }

}
