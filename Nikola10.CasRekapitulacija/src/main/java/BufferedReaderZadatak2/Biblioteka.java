/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferedReaderZadatak2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author Anta
 */
public class Biblioteka {

    private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();

    public void ucitajKnjigu() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            Knjiga k = new Knjiga();
            System.out.print("Unesite naslov knjige: ");
            k.setNaslov(br.readLine());
            System.out.print("Unesite autora knjige: ");
            k.setAutor(br.readLine());
            System.out.print("Unesite ISBN knjige: ");
            k.setISBN(br.readLine());
            if (knjige.contains(k)) {
                throw new RuntimeException("Ta knjiga vec postoji u " + "biblioteci");
            }
            knjige.add(k);
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
    }

    public void ucitajViseKnjiga() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean kraj = false;
        while (!kraj) {
            ucitajKnjigu();
            try {
                System.out.print("Da li zelite da unesete jos neku " + "knjigu(DA/NE)? ");
                String s = br.readLine();
                if (!s.equals("DA")) {
                    kraj = true;
                }
            } catch (Exception e) {
                System.out.println("Greska: " + e.getMessage());
            }
        }
    }

    public void ispisi() {
        if (knjige.size() == 0) {
            System.out.println("Bibilioteka je prazna");
        } else {
            for (int i = 0; i < knjige.size(); i++) {
                System.out.println(knjige.get(i));
            }
        }
    }
}
