package Entity;

import Interface.Element;

public class Image implements Element {
    private String url;
    public Image(String url){
        this.url=url;
    }
    public void print(){
        System.out.println(this.url);
    }

    public void add(Element el) {

    }

    public void remove(Element el) {

    }

    public Element get(int index) {
        return null;
    }
}
