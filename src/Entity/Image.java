package Entity;

import Interface.Element;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private final String url;
    public Image(String url){
        this.url=url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
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
