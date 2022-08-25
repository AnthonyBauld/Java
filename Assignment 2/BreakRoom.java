package view;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.LinkedList;
import java.util.Scanner;

public class playListPartA {
    private static int playlistID;
    public String playlistName;
    public String creator;
    public int displayRunTime = 0;
    public int totalSongs;
    public String addSong;

    public void playList(String creator, int displayRunTime, int totalSongs) {
        this.creator = creator;
        this.displayRunTime = displayRunTime;
        this.totalSongs = totalSongs;
    }
    public void playlist2(String playlistName, String creator, int displayRunTime, int totalSongs, String addSong) {
        this.playlistName = playlistName;
        this.creator = creator;
        this.displayRunTime = displayRunTime;
        this.totalSongs = totalSongs;
        this.addSong = addSong;
    }
    public String songName(String playlistName) {
        String songName = playlistName;
        return songName;
    }
    public String getCreator(String creator) {
        String getCreator = creator;
        return getCreator;
    }
    public String getPlaylistName(String playlistName) {
        String getplaylistName = playlistName;
        return getplaylistName;
    }
    public void displayRunTime(int h, int m, int s) {
        int displayRunTime = (h * 3600 + m * 60 + s);
        if (h == 0) {
            displayRunTime = (m * 60 + s);
        }
    }
    public int getdisplayRunTime(int displayRunTime) {
        int getdisplayRunTime = displayRunTime;
        return displayRunTime;
    }
    public <newSong> void main(String[] args) {
        playlistID = 0;
        playlistID = new Integer(playlistID.getValue() + 1);

        String newSong = playlistName = new playlistName("Random Song - 1",1);
        playlistName.addSong("Random Song - 2",2);
        playlistName.addSong("Random Song - 3"),3;
        playlistName.addSong("Random Song - 4"),4;
        playlistName.addSong("Random Song - 5"),5;
        playlistName.add(newSong);

        LinkedList<newSong> playlistName = new LiankedList<newSong>();
        playlistName.get(1).
    }

    public String toString() {
        return "playlistName: " + songName(), ", creator: " + getCreator() +
                ", playlistName: " + getplaylistName() + ",Display Run Time: " + getdisplayRunTime()
    }
}
