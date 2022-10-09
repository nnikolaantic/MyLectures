/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilieIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Anta
 */
public class FileIO {

    public static void main(String[] args) {

//        relativna putanja
//        ispisiSadrzajFajla("text.txt");
//        aposlutna putanja
//        asci art archive
//        ispisiSadrzajFajla("C:\\Users\\Anta\\Desktop\\TestIO\\text.txt");
//        upisiUFajl("C:\\Users\\Anta\\Desktop\\TestIO\\text2.txt");
        
        System.out.println("Unesite text u fajl : ");
        upisiUFajlPrekoBuffera("C:\\Users\\Anta\\Desktop\\TestIO\\text3.txt");
        ispisiSadrzajFajla("C:\\Users\\Anta\\Desktop\\TestIO\\text3.txt");
    }

    public static void ispisiSadrzajFajla(String putanjaDoFajla) {
        try {
            System.out.println("Sadrzaj vaseg fajla je : ");
            BufferedReader in = new BufferedReader(new FileReader(putanjaDoFajla));
            //Posto ne znamo koliko linija teksta imamo u fajlu icicicemo dok ne dodjemo do kraja
//            odnosno dok string koji pokusamo da porcitamo ne bude null
            boolean kraj = false;
            String s = "";
            while (!kraj) {
                String pom = in.readLine();
                if (pom == null) {
                    kraj = true;
                } else {
                    s = s + pom + "\n ";
                }
            }
            in.close();
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
    }

    public static void upisiUFajl(String putanjaDoFajla) {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(putanjaDoFajla)));
            out.write("Danas je lep dan." + '\n');
            out.write("Mozda ce temperatura biti iznad nule." + '\n');
            out.close();
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
    }
    
    public static void upisiUFajlPrekoBuffera(String putanjaDoFajla){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(putanjaDoFajla)));
            
            String s;
            boolean kraj = false;
            while(!kraj){
                s = br.readLine();
                if(s.equalsIgnoreCase("kraj")){
                    kraj = true;
                }else{
                    out.write("\n" + s);
                }
            }
            out.close();
        } catch (Exception e) {
            System.out.println("Greska: " + e.getMessage());
        }
    }

}
