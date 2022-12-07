package Entity;

import Interface.Element;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    String title;
    public final List<Element> children;
    public Section(String title){
        this.title=title;
        this.children=new ArrayList<>();
    }
    public void add(Element el){
        this.children.add(el);
    }
    public void remove(Element el){
        this.children.remove(el);
    }

    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }

    public Element get(int index){
        return this.children.get(index);
    }
//    public void print(){
//        if(!(this instanceof Book))
//        System.out.println(this.title);
//        for(int i=0;i<this.children.size();i++){
//            this.get(i).print();
//        }
//    }

}
