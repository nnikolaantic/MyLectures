/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NizoviObjekataZadatak3;

/**
 *
 * @author Anta
 */
public class Adresar {

    private Kontakt[] kontakti;

    public Adresar() {
        kontakti = new Kontakt[250];
    }

    public boolean imaSlobodnih() {
        for (int i = 0; i < kontakti.length; i++) {
            if (kontakti[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void unesiUAdresar(Kontakt k) {
        if (!imaSlobodnih()) {
            System.out.println("Nema mesta u adresaru");
        } else {
            for (int i = 0; i < kontakti.length; i++) {
                if (kontakti[i] == null) {
                    kontakti[i] = k;
                    break;
                }
            }
        }
    }

    public void unesiUAdresar(String imePrezime, String adresa, int telefon) {
        if (!imaSlobodnih()) {
            System.out.println("Nema mesta u adresaru");
        } else {
            for (int i = 0; i < kontakti.length; i++) {
                if (kontakti[i] == null) {
                    kontakti[i] = new Kontakt();
                    kontakti[i].setImePrezime(imePrezime);
                    kontakti[i].setAdresa(adresa);
                    kontakti[i].setTelefon(telefon);
                    break;
                }
            }
        }
    }

    public void izbaciIzAdresara(String imePrezime) {
        //Pre provere jedankosti imena i prezimena, 
        //potrebno je proveriti da li je taj element 
        //niza uopste inicijalizovan (!=null). Tek 
        //onda se bezbedno mogu pozivati metode npr. 
        //"getIme". Element adresara se "brise" tako 
        //sto mu se dodeli "null" vrednost. 
        for (int i = 0; i < kontakti.length; i++) {
            if (kontakti[i] != null && kontakti[i].getImePrezime().equals(imePrezime)) {
                kontakti[i] = null;
                break;
            }
        }
    }

    public void ispisi() {
        for (int i = 0; i < kontakti.length; i++) {
            if (kontakti[i] != null) {
                System.out.println(kontakti[i]);
            }
        }
    }
}
