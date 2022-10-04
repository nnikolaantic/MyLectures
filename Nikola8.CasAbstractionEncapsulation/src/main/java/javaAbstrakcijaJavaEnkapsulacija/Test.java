/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaAbstrakcijaJavaEnkapsulacija;

/**
 *
 * @author Anta
 */
public class Test {
    public static void main(String[] args) {
        ClassExample ce = new ClassExample("atribut1","atribut2","atribut3","atribut4");
        
//        System.out.println(ce.atribute1);
//        ce.atribute1 = "IligalnaPromena";
//        System.out.println(ce.atribute1);

        //Pravilno dohvatanje i Menjanje vrednosti atributa u skladu sa Abstrakcijom i Enkapsulacijom
        System.out.println(ce.getAtribute1());
        ce.setAtribute1("LegalnoPromenjenaVrednostAtributa");
        System.out.println(ce.getAtribute1());
    }
}
