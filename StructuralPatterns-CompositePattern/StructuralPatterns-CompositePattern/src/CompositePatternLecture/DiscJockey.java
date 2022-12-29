/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompositePatternLecture;

/**
 *
 * @author anticn
 */
public class DiscJockey {

    SongComponent songList;

    // newSongList contains every Song, SongGroup,
    // and any Songs saved in SongGroups
    public DiscJockey(SongComponent newSongList) {

        songList = newSongList;

    }

    // Calls the displaySongInfo() on every Song
    // or SongGroup stored in songList
    public void getSongList() {

        songList.displaySongInfo();

    }

}
