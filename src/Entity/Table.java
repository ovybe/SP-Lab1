package Entity;

import Interface.Element;

public class Table implements Element {
    private String title;
    public Table(String title){
        this.title=title;
    }
    public void print(){
        System.out.println("Table with title: "+this.title);
    }
}
