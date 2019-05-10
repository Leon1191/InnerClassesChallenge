import java.util.*;

//        Create a program that implements a playlist for songs
//        Create a Song class having Title and Duration for a song
//        The program will have an Album class containing a list of songs.
//        The albums will be stored in an ArrayList
//        Songs from different albums can be added to the playlist and will appear in the list in the order
//        they are added.
//        Once the songs have been added to the playlist, create a menu of options to:
//        Quit, Skip forward to the next song, skip backwards to a previous song. Replay the current song.
//        List the songs in the playlist
//        A song must exist in an album before it can be added to the playlist (so you can only play songs that
//        you own).
//        Hint To replay a song, consider what happened when we went back and forth from a city before we
//        started tracking the direction we were going.
//        As an optional extra, provide an option to remove the current song from the playlist
//        (hint: listiterator.remove()


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

        ListIterator<Song> i = playList.listIterator();

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        boolean forward = true;
        int choice = 9;

        while(flag){

        switch(choice){
            case 1: if (!forward && i.hasNext()){i.next();}
                if (!i.hasNext()) {
                    System.out.println("playList was end");
                    forward = false;
                } else {
                    System.out.println(i.next().getTitle());
                    forward = true;
                }
            break;
            case 2: if  (forward && i.hasPrevious()){i.previous();}
                if (!i.hasPrevious()) {
                    System.out.println("playList was end");
                    forward = true;
                } else {System.out.println(i.previous().getTitle());
                    forward = false;
                }
            break;
            case 3:
            if (forward && i.hasPrevious()) {System.out.println(i.previous().getTitle());
            forward = false;}
            else if (i.hasNext()){System.out.println(i.next().getTitle());
            forward = true;}
            else{
                System.out.println("No current song");}
 break;
            case 4:
                Iterator<Song> j = playList.iterator();
                while(j.hasNext()){
                    System.out.println(j.next().getTitle());
                }
            break;
            case 5: if (forward && i.hasPrevious()) {System.out.println(i.previous().getTitle() + " was delete");
            i.remove();
                      }
            else if (!forward && i.hasNext()){System.out.println(i.next().getTitle() + " was delete");
            i.remove();
            }
            else{
                System.out.println("No current song");
                break;}
                if (i.hasNext()){
                    System.out.println("Now current song is " + i.next().getTitle());
                }
                else{System.out.println("Now current song is " + i.previous().getTitle());
                }
                break;
            case 9:
                System.out.println(
                        "1 - next song\n" +
                        "2 - previous song\n" +
                        "3 - replay song\n" +
                        "4 - print list of songs\n" +
                        "5 - delete current song\n" +
                        "9 - show menu\n" +
                        "0 - exit");
                break;
            case 0: flag = false;
                break;
        }
            choice = scanner.nextInt();
            scanner.nextLine();
}
    }
}
// Modify the playlist challenge so that the Album class uses an inner class.
// Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
// The inner SongList class will use an ArrayList and will provide a method to add a song.
// It will also provide findSong() methods which will be used by the containing Album class
// to add songs to the playlist.
// Neither the Song class or the Main class should be changed.
