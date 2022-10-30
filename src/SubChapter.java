import java.util.ArrayList;
import java.util.Collection;

public class SubChapter {
    private String name;
    private ArrayList<Image> images;
    private ArrayList<Paragraph> paragraphs;
    private ArrayList<Table> tables;
    public SubChapter(String name){
        this.name=name;
        this.images=new ArrayList<Image>();
        this.paragraphs=new ArrayList<Paragraph>();
        this.tables=new ArrayList<Table>();
    }
    public int createNewParagraph(String text){
        Paragraph paragraph=new Paragraph(text);
        this.paragraphs.add(paragraph);
        return this.paragraphs.indexOf(paragraph);
    }
    public int createNewImage(String imageName){
        Image image=new Image(imageName);
        this.images.add(image);
        return this.images.indexOf(image);
    }
    public int createNewTable(String title){
        Table table=new Table(title);
        this.tables.add(table);
        return this.tables.indexOf(table);
    }
    public void print(){
        System.out.println("Subchapter: "+this.name);
        for(Image im : this.images){
            im.print();
        }
        for(Paragraph ph : this.paragraphs){
            ph.print();
        }
        for(Table tb : this.tables){
            tb.print();
        }
    }
}
