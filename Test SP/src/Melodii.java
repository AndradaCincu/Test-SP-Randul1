public class Melodii extends Playlist {
    private int durata;

    public Melodii(String titlu, int dimensiune, int durata){
        super(titlu,dimensiune);
        this.durata=durata;
    }



    public void print() {
        System.out.println("Melodia-ul areo durata de: " + this.durata);

    }
}
