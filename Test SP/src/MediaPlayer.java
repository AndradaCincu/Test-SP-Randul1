import java.util.ArrayList;

public class MediaPlayer implements Element {
    private String titlu;
    private ArrayList<Element> elements;

    public MediaPlayer() {
        this.titlu = "";
        this.elements = new ArrayList<Element>();
    }

    public MediaPlayer(String titlu) {
        this.titlu = titlu;
        this.elements = new ArrayList<Element>();
    }

    public MediaPlayer(String titlu, ArrayList<Element> elements){
        this.titlu=titlu;
        this.elements=elements;
    }

    public void add(Element element) {
        elements.add(element);
    }



    @Override
    public void print() {
        System.out.println("MediaPlayer " + this.titlu);
        if (elements != null) {
            for (Element i: elements)
                i.print();
        }
    }
}
