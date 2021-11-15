import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        MediaPlayer  playlist = new MediaPlayer("Media Player");

        ArrayList<Element> elements = new ArrayList<Element>();

        Video videoclip =  new Video("Vide 1", 23, 5, new Dsecarcare());
        Video videoclip1 =  new Video("Vide 2", 53, 5,new Dsecarcare());
        Video videoclip3 =  new Video("Vide 2", 53, 5);


        Melodii melodie = new Melodii("Melodie 1", 15, 3 );
        Gif gif = new Gif("Gif 1", 8, 1);
        Playlist plst= new Playlist("Playlist 1",200 );

        playlist.add(videoclip);
        playlist.add(videoclip1);
        playlist.add(melodie);
        playlist.add(gif);
        playlist.add(plst);

        playlist.print();

    }
}
