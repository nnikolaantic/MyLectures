/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessModifiers;

/**
 *
 * @author JAVA4
 */
public class AccessModifiers {
    public static void main(String[] args) {
        Song song1 =  new Song("Luda za tobom","Lepa Brena",3);
        
//        System.out.println(song1.title);
        System.out.println(song1.getTitle());
    }
}
