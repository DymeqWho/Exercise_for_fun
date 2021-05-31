package lists.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    private Song findSong(String title) {
        if (songs != null) {
            for (int i = 0; i <= songs.size() - 1; i++) {
                if (songs.get(i).getTitle().equals(title))
                    return songs.get(i);
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null && songs != null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumberOfSong, LinkedList<Song> thePlaylist) {
        try {
            if (songs.get(trackNumberOfSong - 1) != null) {
                thePlaylist.add(songs.get(trackNumberOfSong - 1));
                return true;
            }
            return false;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> thePlaylist) {
        if (findSong(titleOfSong) != null) {
            thePlaylist.add(findSong(titleOfSong));
            return true;
        }
        return false;
    }
}
