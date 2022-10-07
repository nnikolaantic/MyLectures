/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractneKlaseZadatak1;

/**
 *
 * @author Anta
 */
public abstract class Vozilo {

    private String marka;
    private String model;

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

    abstract boolean daLiIdePoKopnu();

    abstract boolean daLiIdePoVodi();

    abstract boolean daLiIdePoVazduhu();

    void ispisi() {
        System.out.println("Marka vozila: " + marka);
        System.out.println("Model vozila: " + model);
        if (daLiIdePoKopnu()) {
            System.out.println("Vozilo moze da ide po kopnu");
        }else if (daLiIdePoVodi()) {
            System.out.println("Vozilo moze da ide po vodi");
        }else if (daLiIdePoVazduhu()) {
            System.out.println("Vozilo moze da leti");
        }
    }
}
