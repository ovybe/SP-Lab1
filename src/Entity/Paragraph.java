package Entity;

import Interface.Element;

public class Paragraph implements Element {
    private String text;
    public Paragraph(String text){
        this.text=text;
    }
    public void print(){
        System.out.println("Paragraph: "+this.text);
    }

}
