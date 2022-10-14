/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NasledjivanjeZadatak2;

/**
 *
 * @author Anta
 */
public class Televizor extends KucniAparat{

    private int program = 1;

    Televizor(String marka, String model, boolean ukljucen, int program) {
        super(marka, model, ukljucen);
        if (program >= 1 && program <= 40) {
            this.program = program;
        } else {
            System.out.println("Greska");
        }
    }

    void promeniProgramNavise() {
        if (program < 40) {
            program++;
        } else {
            program = 1;
        }
    }

    void promeniProgramNanize() {
        if (program > 1) {
            program--;
        } else {
            program = 40;
        }
    }

    @Override
    void ispisi() {
        super.ispisi();
        System.out.println("Trenutno je pusten " + program + ". program");
    }
}
