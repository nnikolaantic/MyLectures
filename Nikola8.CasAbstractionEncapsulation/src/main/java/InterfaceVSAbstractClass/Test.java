/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceVSAbstractClass;

/**
 *
 * @author Anta
 */
public class Test {

    public static void main(String[] args) {
        //Razvoj pravih aplikacija nije puno komplikovaniji od ovoga
        
        MuzickiStub ms = new MuzickiStub();
        ms.ukljuci();
        //Kasnije cemo npr ovu metodu pojacaj ton povezati sa dugmetom pojacaj ton npr.
        ms.pojacajTon();
        ms.pojacajTon();
//        ms.promeniStanicu(88.9);
        ms.pustiPesmu(6);
        ms.ispisi();
    }
}
