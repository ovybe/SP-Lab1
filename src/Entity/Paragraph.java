package Entity;

import Interface.Element;

public class Paragraph implements Element {
    private final String text;
    public Paragraph(String text){
        this.text=text;
    }
    public void print(){
        System.out.println("Paragraph: "+this.text);
    }

    public void add(Element el) {

    }

    public void remove(Element el) {

    }

    public Element get(int index) {
        return null;
    }

}
