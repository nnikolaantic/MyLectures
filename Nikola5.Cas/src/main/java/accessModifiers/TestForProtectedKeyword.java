/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessModifiers;

/**
 *
 * @author JAVA4
 */
public class TestForProtectedKeyword {
    public static void main(String[] args) {
        //Pristup private public protected vrednostima iz drugog java paketa
        
        Song songTest = new Song("Svetlana Ceca Raznatovic", "Pile", 4);
        
        //Default
        System.out.println(songTest.testDefault);
        
        //Ne mozemo pristupiti private atributima jer oni dozvoljavaju pristup samo na nivu klase
        
        //Getters and Setters su public i mozemo im pristupiti
        songTest.getArtisit();
        songTest.getTitle();
        songTest.getLenght();
        
        //Metoda play song je public i takodje joj mozemo pristupiti
        songTest.playSong();
        
        //Ovde mozemo da pristupimo necemu sto je protected jer smo u istom paketu
        System.out.println(songTest.dj);
    }
}
