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
public class Avion {

    private MestoUAvionu[] mesta;

    public Avion() {
        mesta = new MestoUAvionu[120];
        for (int i = 0; i < 120; i++) {
            mesta[i] = new MestoUAvionu();
        }
    }

    public void uvediPutnika(int brojMesta, String imePrezime, int starost) {
        if (brojMesta < 0 || brojMesta > 119 || !mesta[brojMesta].isSlobodno()) {
            System.out.println("Greska");
        } else {
            mesta[brojMesta].setSlobodno(false);
            mesta[brojMesta].setImePrezime(imePrezime);
            mesta[brojMesta].setStarost(starost);
        }
    }

    public void izvediPutnika(int brojMesta) {
        if (brojMesta < 0 || brojMesta > 119 || mesta[brojMesta].isSlobodno()) {
            System.out.println("Greska");
        } else {
            mesta[brojMesta].setSlobodno(true);
            mesta[brojMesta].setImePrezime(null);
            mesta[brojMesta].setStarost(0);
        }
    }

    public boolean daLiJeUAvionu(String imePrezime, int starost) {
        for (int i = 0; i < 120; i++) {
            if (!mesta[i].isSlobodno() && mesta[i].getImePrezime().equals(imePrezime) && mesta[i].getStarost() == starost) {
                return true;
            }
        }
        return false;
    }

    public double procentualnaZauzetost() {
        int brojZauzetih = 0;
        for (int i = 0; i < 120; i++) {
            if (!mesta[i].isSlobodno()) {
                brojZauzetih++;
            }
        }
        return (brojZauzetih * 100.0) / 120.0;
    }

    public boolean daLiImaSlobodnih() {
        for (int i = 0; i < 120; i++) {
            if (mesta[i].isSlobodno()) {
                return true;
            }
        }
        return false;
    }

    public int prosecnaStarost() {
        int suma = 0;
        int brojZauzetih = 0;
        for (int i = 0; i < 120; i++) {
            if (!mesta[i].isSlobodno()) {
                suma = suma + mesta[i].getStarost();
                brojZauzetih++;
            }
        }
        return suma / brojZauzetih;
    }

    public int najstarijiPutnik() {
        int maxGodine = 0;
        for (int i = 0; i < 120; i++) {
            if (!mesta[i].isSlobodno() && mesta[i].getStarost() > maxGodine) {
                maxGodine = mesta[i].getStarost();
            }
        }
        return maxGodine;
    }

    public int najmladjiPutnik() {
        int minGodine = 200;
        for (int i = 0; i < 120; i++) {
            if (!mesta[i].isSlobodno() && mesta[i].getStarost() < minGodine) {
                minGodine = mesta[i].getStarost();
            }
        }
        return minGodine;
    }

    public void ispisi() {
        for (int i = 0; i < 120; i++) {
            System.out.println("Sediste " + i + " " + mesta[i]);
        }
    }

    public void ispisiJovanovice() {
        for (int i = 0; i < 120; i++) {
            if (!mesta[i].isSlobodno()) {
                String imePrezime = mesta[i].getImePrezime();
                String prezime = imePrezime.substring(imePrezime.indexOf(' ') + 1);
                if (prezime.equals("Jovanovic")) {
                    System.out.println(mesta[i]);
                }
            }
        }
    }

}
