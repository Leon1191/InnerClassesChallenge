import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private SongList songList;

    public Album(String name){
        this.name = name;
        this.songList = new SongList();
    }
    public void addSong(String title, double duration){
        this.songList.addSong(title,duration);
    }

public void addToPlayList(String title, LinkedList<Song> playList){
        if (songList.findSong(title) == -1){
        System.out.println("Song " + title + " is not exist");
    }
    else{playList.add(songList.songs.get(songList.findSong(title)));}
}

private class SongList{

private ArrayList<Song> songs;

    private SongList() {
        this.songs = new ArrayList<Song>();
    }

    private void addSong(String title, double duration){
        if(findSong(title) == -1){
        this.songs.add(new Song(title,duration));}
        else{
            System.out.println("Song already exist");}
    }

    private int findSong(String title){
        for(Song i: this.songs){
            if(i.getTitle().equals(title)){return this.songs.indexOf(i);}
        }
        return -1;
    }
}
}
// Modify the playlist challenge so that the Album class uses an inner class.
// Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
// The inner SongList class will use an ArrayList and will provide a method to add a song.
// It will also provide findSong() methods which will be used by the containing Album class
// to add songs to the playlist.
// Neither the Song class or the Main class should be changed.