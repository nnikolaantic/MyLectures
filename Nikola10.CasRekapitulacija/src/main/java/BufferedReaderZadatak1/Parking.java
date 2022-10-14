/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferedReaderZadatak1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Anta
 */
public class Parking {

    private ParkingMesto[] mesta;

    public void unesiKapacitet() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Unesite kapacitet parkinga: ");
            String s = br.readLine();
            int kapacitet = Integer.parseInt(s);
            if (kapacitet <= 0) {
                mesta = new ParkingMesto[20];
            } else {
                mesta = new ParkingMesto[kapacitet];
            }
        } catch (Exception e) {
            System.out.println("Greska pri unosu kapaciteta parkinga: " + e.getMessage());
            mesta = new ParkingMesto[20];
        }
        for (int i = 0; i < mesta.length; i++) {
            mesta[i] = new ParkingMesto();
            mesta[i].setSlobodno(true);
        }
    }

    public void unesiElemente() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (mesta == null) {
            throw new RuntimeException("Parking nije inicijalizovan");
        }
        for (int i = 0; i < mesta.length; i++) {
            try {
                System.out.print("Unesite podatke za " + i + ". parking mesto: ");
                String s = br.readLine();
                if (s.equalsIgnoreCase("slobodno")) {
                    mesta[i].setSlobodno(true);
                    mesta[i].setRegistarskiBroj(null);
                } else {
                    mesta[i].setSlobodno(false);
                    mesta[i].setRegistarskiBroj(s);
                }
            } catch (Exception e) {
                System.out.println("Greska pri unosu " + i + ". elementa: " + e.getMessage());
            }
        }
    }

    public void ispisi() {
        if (mesta == null) {
            throw new RuntimeException("Parking nije inicijalizovan");
        }
        for (int i = 0; i < mesta.length; i++) {
            System.out.println(i + ". parking mesto:" + mesta[i]);
        }
    }

}
