/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessModifiers;

/**
 *
 * @author JAVA4
 */
public class Song {
    protected String dj = "Sone";
    String testDefault = "deafult";
    
    private String title;
//    public String title;
    private String artisit;
    private int lenght;

    public Song(String title, String artisit, int lenght) {
        this.title = title;
        this.artisit = artisit;
        this.lenght = lenght;
    }
//    private Song(String title, String artisit, int lenght) {
//        this.title = title;
//        this.artisit = artisit;
//        this.lenght = lenght;
//    }
    public void playSong(){
        System.out.println("Playing: " + title + "----> by :" + artisit + "duration : " + lenght + "/min");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtisit() {
        return artisit;
    }

    public void setArtisit(String artisit) {
        this.artisit = artisit;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
    
    
    
}
