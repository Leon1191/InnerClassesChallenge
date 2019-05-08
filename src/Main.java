import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<Album>();

        LinkedList<Song> playList = new LinkedList<Song>();




        Album album = new Album("Rock");
        album.addSong("Piece of mind", 4.3);
        album.addSong("Rock forever", 2.3);
        album.addSong("Help me", 4.5);
        album.addSong("Rising sun", 5.1);
albums.add(album);
//        System.out.println(album.findSong("Piece of mind"));


album = new Album("Soul");

        album.addSong("You my heart", 3.5);
        album.addSong("What is love", 4.0);
        album.addSong("One way ticket", 4.1);
        album.addSong("The world is mine", 4.6);
        albums.add(album);

        albums.get(0).addToPlayList("Help me",playList);
        System.out.println(playList.getFirst().getTitle());












    }
}
