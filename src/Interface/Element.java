package Interface;

import Entity.Visitor;

public interface Element {
//    void print();
    void add(Element el);
    void remove(Element el);
    void accept(Visitor visitor);
    Element get(int index);
}
