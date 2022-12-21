/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratorPatternLecture;

/**
 *
 * @author anticn
 */
import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator {

    // ArrayList holds SongInfo objects
    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s() {
        bestSongs = new ArrayList<SongInfo>();
        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);
    }

    // Add a SongInfo object to the end of the ArrayList
    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.add(songInfo);
    }

    // Get rid of this
    // Return the ArrayList filled with SongInfo Objects
    public ArrayList<SongInfo> getBestSongs() {
        return bestSongs;
    }

    // NEW By adding this method I'll be able to treat all
    // collections the same
    public Iterator createIterator() {
        // TODO Auto-generated method stub
        return bestSongs.iterator();
    }

}
