package Entity;

import Entity.Image;
import Entity.Paragraph;
import Interface.Element;

import java.util.ArrayList;

public class SubChapter {
    private String name;
    private ArrayList<Element> elements;
    public SubChapter(String name){
        this.name=name;
        this.elements=new ArrayList<Element>();
    }
    public int createNewParagraph(String text){
        Paragraph paragraph=new Paragraph(text);
        this.elements.add(paragraph);
        return this.elements.indexOf(paragraph);
    }
    public int createNewImage(String imageName){
        Image image=new Image(imageName);
        this.elements.add(image);
        return this.elements.indexOf(image);
    }
    public int createNewTable(String title){
        Table table=new Table(title);
        this.elements.add(table);
        return this.elements.indexOf(table);
    }
    public void print(){
        System.out.println("Subchapter: "+this.name);
        for(Element el : this.elements){
            el.print();
        }
    }
}
