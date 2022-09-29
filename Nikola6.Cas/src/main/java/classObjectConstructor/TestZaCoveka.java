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
public class TestZaCoveka {
    public static void main(String[] args) {
        //Drugi korak objekat bez konstruktora
        Covek covek1 = new Covek();
        covek1.ime = "Rale";
        covek1.prezime = "Rajcic";
        covek1.godine = 33;
        covek1.mail = "raleCare@gmail.com";
        covek1.pol = 'm';
        covek1.zanimanje = "Programer";
        
        Covek covek2 = new Covek();
        covek2.ime = "Ana";
        covek2.prezime = "Simic";
        covek2.godine = 25;
        covek2.mail = "ana@gmail.com";
        covek2.pol = 'z';
        covek2.zanimanje = "Pevacica";
        //Drugi korak objekat bez konstruktora
        
        //Treci korak inicijalizacija objekta uz pomoc konstruktora
        Covek covek3 = new Covek("Sasa", "Peric", 40, "sasasale@gmail.com", 'm', "Moler");
        Covek covek4 = new Covek("Marija", "Peric", 35, "marija@gmail.com", 'z', "Slikarka");
        
//        System.out.println(covek1.toString());

//        Cetvrti korak metode u klasi, overide toString-a
//        Ovde smo pozvali metodu iz nase klase Covek preko objekta koji smo inicijalizovali preko konstruktora
        System.out.println(covek1.toString());
        System.out.println(covek1.posao());
        
        System.out.println(covek2.toString());
        System.out.println(covek2.posao());
        
        System.out.println(covek3.toString());
        System.out.println(covek3.posao());
        
        System.out.println(covek4.toString());
        System.out.println(covek4.posao());
        
        //Peti korak sataviti objekte u niz
        
        Covek[] nizCovek = {covek1,covek2,covek3,covek4};
        
        ispisNizCovek(nizCovek);
        
    }
    public static void ispisNizCovek(Covek[] nizCovek){
        for (int i = 0; i < nizCovek.length; i++) {
            System.out.println(nizCovek[i].posao());
        }
    }
    
}
