package Entity;

import Interface.Element;

public class TableOfContents implements Element {
    public TableOfContents(){

    }
//    public void print() {
//        System.out.println("Table of Contents");
//    }

    public void add(Element el) {

    }

    public void remove(Element el) {

    }

    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }

    public Element get(int index) {
        return null;
    }
}
