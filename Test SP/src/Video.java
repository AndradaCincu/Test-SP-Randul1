public class Video extends Playlist {
    private int durata;
    private Internet internet;

    public Video(String titlu, int dimensiune, int durata, Dsecarcare dsecarcare){
        super(titlu,dimensiune);
        this.durata=durata;
    }


    public Video(String titlu, int dimensiune, int durata){
        super(titlu,dimensiune);
        this.durata=durata;
    }

    public void setInternet(Internet internet){
        this.internet=internet;
    }



    public void print() {
        String message = "@URL " + this.titlu  ;
        if (internet != null)
            this.internet.print(message);
        else
            System.out.println("@URL " + this.titlu );
    }
}
