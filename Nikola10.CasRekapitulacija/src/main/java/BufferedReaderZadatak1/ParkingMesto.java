/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferedReaderZadatak1;

/**
 *
 * @author Anta
 */
public class ParkingMesto {

    private boolean slobodno;
    private String registarskiBroj;

    public String getRegistarskiBroj() {
        return registarskiBroj;
    }

    public void setRegistarskiBroj(String registarskiBroj) {
        this.registarskiBroj = registarskiBroj;
    }

    public boolean isSlobodno() {
        return slobodno;
    }

    public void setSlobodno(boolean slobodno) {
        this.slobodno = slobodno;
    }

    @Override
    public String toString() {
        if (slobodno) {
            return "Slobodno";
        } else {
            return registarskiBroj;
        }
    }

}
