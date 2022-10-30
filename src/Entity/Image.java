package Entity;

import Interface.Element;

public class Image implements Element {
    private String imageName;
    public Image(String name){
        this.imageName=name;
    }
    public void print(){
        System.out.println("Image with name: "+this.imageName);
    }
}
