package Entity;

import Interface.Element;

public class Paragraph implements Element {
    public final String text;
    public AlignStrategy textAlignment;
    public Paragraph(String text){
        this.text=text;
    }
    public String getText(){
        return text;
    }
    public void setAlignStrategy(AlignStrategy alignment){
        this.textAlignment=alignment;
    }
//    public void print(){
//        if(textAlignment==null){
//            System.out.println("Paragraph: "+this.text);
//        }
//        else
//            System.out.println("Paragraph: "+textAlignment.render(this));
//    }

    public void add(Element el) {

    }

    public void remove(Element el) {

    }

    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

    public Element get(int index) {
        return null;
    }

}
