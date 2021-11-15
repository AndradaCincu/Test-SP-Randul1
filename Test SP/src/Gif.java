public class Gif extends Playlist{

    private int durata;

    public Gif(String titlu, int dimensiune, int durata){
        super(titlu,dimensiune);
        this.durata=durata;
    }


    public void print() {
        System.out.println("Gif-ul are o durata de: " + this.durata);

    }
}
