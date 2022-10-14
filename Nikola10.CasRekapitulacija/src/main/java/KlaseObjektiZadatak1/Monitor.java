/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KlaseObjektiZadatak1;

/**
 *
 * @author Anta
 */
public class Monitor {

    String marka;
    String model;
    int dijagonala;

    public int getDijagonala() {
        return dijagonala;
    }

    public void setDijagonala(int dijagonala) {
        if (dijagonala >= 12) {
            this.dijagonala = dijagonala;
        } else {
            System.out.println("Greska");
        }
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        if (marka != null) {
            this.marka = marka;
        } else {
            System.out.println("Greska");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null) {
            this.model = model;
        } else {
            System.out.println("Greska");
        }
    }

    @Override
    public String toString() {
        return "Marka monitora: " + marka + " Model: " + model + " Dijagonala: " + dijagonala;
    }

    @Override
    public boolean equals(Object o) {
        //Operatorom instanceof se proverava da li ulazni argument 
        //o zaista sadrzi objekat klase Monitor. 
        if (o instanceof Monitor) {
            Monitor m = (Monitor) (o);
            if (marka.equals(m.getMarka()) && model.equals(m.getModel()) && dijagonala == m.getDijagonala()) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Greska");
            return false;
        }
    }

}
