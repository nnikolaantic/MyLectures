/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedReaderExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Anta
 */
public class BufferedReaderExample {

    public static void main(String[] args) {
        ucitajIIspisiString();
        //        SKENER UCITAVA SAMO PO 1 STRING, KARAKTER, BROJ...
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println("Unesite purku preko scanera");
        System.out.println(s);
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Unesite poruku preko buffera");
            String sb = br.readLine();
            System.out.println(sb);
        } catch (IOException ex) {
            Logger.getLogger(BufferedReaderExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void ucitajIIspisiString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Unesite poruku: ");
            String s = br.readLine();
            System.out.println("Uneli ste: " + s);
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
    }

    public static void ucitajBrojIIspisiParnost() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Unesite ceo broj: ");
            String s = br.readLine();
            int i = Integer.parseInt(s);
            if (i % 2 == 0) {
                System.out.println("Broj je paran");
            } else {
                System.out.println("Broj je neparan");
            }
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
    }
    
    public void ucitajBrojIIspisiKvadrat() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Unesite realan broj: ");
            String s = br.readLine();
            double d = Double.parseDouble(s);
            System.out.println("Kvadrat je: " + (d * d));
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
    }
    
}
