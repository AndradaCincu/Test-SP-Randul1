public  class Playlist implements Element{

    protected String titlu;
    private int dimensiune;

    public Playlist(String titlu, int dimensiune){
        this.titlu=titlu;
        this.dimensiune=dimensiune;

    }


    public void print() {
        System.out.println("Playlist: " + this.titlu);

    }


}
