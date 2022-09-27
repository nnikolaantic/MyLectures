/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesModifiersProtected;

import accessModifiers.Access1;

/**
 *
 * @author Anta
 */
public class Access3 extends Access1{
    public static void main(String[] args) {
        Access1 a1 = new Access1();
//        System.out.println(a1.deafult);
        System.out.println(a1.publicMod);
//        System.out.println(a1.privateMod);
//        System.out.println(a1.protectedMod);
        Access3 a3 = new Access3();
        System.out.println(a3.protectedMod);
    }
}
