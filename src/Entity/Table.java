package Entity;

import Interface.Element;

public class Table implements Element {
    public final String title;
    public Table(String title){
        this.title=title;
    }
//    public void print(){
//        System.out.println("Table with title: "+this.title);
//    }

    public void add(Element el) {

    }

    public void remove(Element el) {

    }

    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }

    public Element get(int index) {
        return null;
    }
}
