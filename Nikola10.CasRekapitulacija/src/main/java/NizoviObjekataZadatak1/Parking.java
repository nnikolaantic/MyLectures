/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NizoviObjekataZadatak1;

/**
 *
 * @author Anta
 */
public class Parking {

    private ParkingMesto[] mesta;

    public Parking(int kapacitet) {
        if (kapacitet > 0) {
            mesta = new ParkingMesto[kapacitet];
        } else {
            System.out.println("Greska");
            mesta = new ParkingMesto[40];
        }
        for (int i = 0; i < mesta.length; i++) {
            mesta[i] = new ParkingMesto();
            mesta[i].setSlobodno(true);
        }
    }

    public void ispisiPrvo() {
        if (mesta[0].isSlobodno()) {
            System.out.println("Prvo mesto je slobodno");
        } else {
            System.out.println("Registarski broj: " + mesta[0].getRegistarskiBroj());
        }
    }

    public void ispisiPoslednje() {
        if (mesta[mesta.length - 1].isSlobodno()) {
            System.out.println("Poslednje mesto je slobodno");
        } else {
            System.out.println("Registarski broj: " + mesta[mesta.length - 1].getRegistarskiBroj());
        }
    }

    public boolean imaSlobodnih() {
        for (int i = 0; i < mesta.length; i++) {
            if (mesta[i].isSlobodno()) {
                return true;
            }
        }
        return false;
    }

    public int brojSlobodnih() {
        int brojac = 0;
        for (int i = 0; i < mesta.length; i++) {
            if (mesta[i].isSlobodno()) {
                brojac++;
            }
        }
        return brojac;
    }

    public boolean daLiJeNaParkingu(String regBr) {
        for (int i = 0; i < mesta.length; i++) {
            if (!(mesta[i].isSlobodno())) {
                String regBr1 = mesta[i].getRegistarskiBroj();
                if (regBr1.equals(regBr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void uvediNaParking(String regBr) {
        if (!imaSlobodnih()) {
            System.out.println("Nema slobodnih mesta");
        } else {
            for (int i = 0; i < mesta.length; i++) {
                if (mesta[i].isSlobodno()) {
                    mesta[i].setSlobodno(false);
                    mesta[i].setRegistarskiBroj(regBr);
                    break;
                }
            }
        }
    }

    public void izvediSaParkinga(String regBr) {
        if (!daLiJeNaParkingu(regBr)) {
            System.out.println("To vozilo se ne nalazi na parkingu");
        } else {
            for (int i = 0; i < mesta.length; i++) {
                if (!mesta[i].isSlobodno() && mesta[i].getRegistarskiBroj().equals(regBr)) {
                    mesta[i].setSlobodno(true);
                    mesta[i].setRegistarskiBroj(null);
                    break;
                }
            }
        }
    }

    public void ispisi() {
        for (int i = 0; i < mesta.length; i++) {
            if (!mesta[i].isSlobodno()) {
                System.out.println("Mesto br." + i + " Reg. br. " + mesta[i].getRegistarskiBroj());
            }
        }
    }

    public void ispisiBG() {
        for (int i = 0; i < mesta.length; i++) {
            if (!mesta[i].isSlobodno()) {
                String grad = mesta[i].getRegistarskiBroj().substring(0, 2);
                if (grad.equals("BG")) {
                    System.out.println("Mesto br." + i + " Reg. br. " + mesta[i].getRegistarskiBroj());
                }
            }
        }
    }
}
