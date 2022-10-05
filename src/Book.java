import java.util.ArrayList;

public class Book {
    private String name;
    private ArrayList<String> paragraphs;
    private ArrayList<String> tables;
    private ArrayList<String> images;
    public Book(String name){
        this.name=name;
        this.paragraphs=new ArrayList<>();
        this.tables=new ArrayList<>();
        this.images=new ArrayList<>();
    }
    public void createNewParagraph(String name){
        this.paragraphs.add(name);
    }
    public void createNewImage(String name){
        this.images.add(name);
    }
    public void createNewTable(String name){
        this.tables.add(name);
    }
    public String toString(){
        return "Names:\n"+this.paragraphs+"\nImages:\n"+this.images+"\nTables\n"+this.tables;
    }
    public void printeach(ArrayList list){
        for(Object i : list){
            System.out.println(i);
        }
    }
    public void print(){
        System.out.println("[---Name---]");
        System.out.println(this.name);
        System.out.println("[---Paragraphs---]");
        printeach(paragraphs);
        System.out.println("[---Images---]");
        printeach(images);
        System.out.println("[---Tables---]");
        printeach(tables);
    }
}
