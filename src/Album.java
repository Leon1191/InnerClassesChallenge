import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name){
        this.name = name;
        this.songs = new ArrayList<Song>();
    }
public void addSong(String title, double duration){
  this.songs.add(new Song(title,duration));
}

public int findSong(String title){
        for(Song i: this.songs){
            if(i.getTitle().equals(title)){return this.songs.indexOf(i);}
                  }
    return -1;
}
public void addToPlayList(String title, LinkedList<Song> playList){
        if (findSong(title) < 0){
        System.out.println("Song is not exist");
    }
    else{playList.add(this.songs.get(findSong(title)));}
}

}
