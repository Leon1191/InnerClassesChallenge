import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Album album = new Album("Rock");
        album.addSong("Piece of mind", 4.3);
        album.addSong("Rock forever", 2.3);
        album.addSong("Help me", 4.5);
        album.addSong("Rising sun", 5.1);

        ArrayList<Album> albums = new ArrayList<Album>();
albums.add(album);
//        System.out.println(album.findSong("Piece of mind"));

album = new Album("Soul");

        album.addSong("You my heart", 3.5);
        album.addSong("What is love", 4.0);
        album.addSong("One way ticket", 4.1);
        album.addSong("The world is mine", 4.6);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();

        albums.get(0).addToPlayList("Help me",playList);
        albums.get(0).addToPlayList("Rock forever",playList);
        albums.get(0).addToPlayList("Rising sun",playList);
        albums.get(0).addToPlayList("Shit",playList);
        albums.get(1).addToPlayList("One way ticket",playList);
        albums.get(1).addToPlayList("The world is mine",playList);

play(playList);
//        System.out.println(playList.get(3).getTitle());






    }
    public static void play(LinkedList<Song> playList){



        Iterator<Song> i = playList.iterator();
        System.out.println(i.next().getTitle());


        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while(flag){

        int choise = scanner.nextInt();
        scanner.nextLine();

        switch(choise){
            case 1: System.out.println(i.next().getTitle());
            break;
            case 2: flag = false;
            break;
        }
}

    }
}
