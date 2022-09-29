/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classObjectConstructor;

import java.util.Scanner;

/**
 *
 * @author Anta
 */
public class TestZaPregledKodZubara {
    public static void main(String[] args) {
        PregledKodZubara pkz1 = new PregledKodZubara("Nikola", "Milic", "08 : 30", "Vadjenje zuba");
        PregledKodZubara pkz2 = new PregledKodZubara("Laza", "Maza", "09 : 30", "Pregled zuba");
        PregledKodZubara pkz3 = new PregledKodZubara("Sasa", "Matic", "11 : 40", "Sistematski pregled");
        PregledKodZubara pkz4 = new PregledKodZubara("Sara", "Saric", "13 : 00", "Vadjenje zuba");
        
//        int[] nizInt = {1,2,3};
//        for(int i : nizInt){
//            System.out.println(i);
//        }
        
//        PregledKodZubara[] nizTermina = new PregledKodZubara[4];
//        nizTermina[0] = pkz1;
//        nizTermina[1] = pkz2;
//        nizTermina[2] = pkz3;
//        nizTermina[3] = pkz4;

        PregledKodZubara[] nizTermina = {pkz1,pkz2,pkz3,pkz4};
        
//        for(PregledKodZubara pkz : nizTermina){
//            pkz.proveriTermin();
//            System.out.println("--------------------------------");
//        }
        
//      Ako metoda nije staticka moramo da je pozovemo preko klase u kojoj je definisana
//        Scanner scan = new Scanner(System.in);
//        scan.close();
        TestZaPregledKodZubara tzpkz = new TestZaPregledKodZubara();
        tzpkz.ispisiTermine(nizTermina);
    }
    
    public void ispisiTermine(PregledKodZubara[] nizTermina){
        for(PregledKodZubara pkz : nizTermina){
            pkz.proveriTermin();
            System.out.println("--------------------------------");
        }
    }
}
