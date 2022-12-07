package Entity;

import Interface.Element;

import java.awt.*;

public class ImageProxy implements Element {
    protected String url;
    protected Dimension dim;
    protected Image realImage;
    public ImageProxy(String url){
        this.url=url;
    }
    Image loadimage(){
        if(realImage==null){
            realImage=new Image(url);
        }
        return realImage;
    }

//    @Override
//    public void print() {
//        loadimage().print();
//    }

    @Override
    public void add(Element el) {

    }

    @Override
    public void remove(Element el) {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }

    @Override
    public Element get(int index) {
        return null;
    }
}
