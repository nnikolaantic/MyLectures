/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatePatternLecture;

/**
 *
 * @author anticn
 */
public class SandwichSculptor {

    public static void main(String[] args) {

        Hoagie cust12Hoagie = new ItalianHoagie();

        cust12Hoagie.makeSandwich();

        System.out.println();

        Hoagie cust13Hoagie = new VeggieHoagie();

        cust13Hoagie.makeSandwich();

    }

} 
