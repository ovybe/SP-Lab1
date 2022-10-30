import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Book {
    // responsible for Chapter
    private String title;
    private ArrayList<Chapter> chapters;
    private ArrayList<Author> authors;
    public Book(String title){
        this.title=title;
        this.chapters= new ArrayList<>();
        this.authors= new ArrayList<>();
    }
    public void addAuthor(Author author){
        this.authors.add(author);
    }
    public int createChapter(String name){
        Chapter chapter = new Chapter(name);
        this.chapters.add(chapter);
        return this.chapters.indexOf(chapter);
    }
    public Chapter getChapter(int index){
        return this.chapters.get(index);
    }
//    public void printeach(List list){
//        for(Object i : list){
//            System.out.println(i);
//        }
//    }
    public void print(){
        System.out.println("Title: "+this.title);
        for(Object i : this.authors){
            System.out.println("Author: "+i);
        }
        for(Object i : this.chapters){
            System.out.println("Chapter: "+i);
        }
    }
    // HW ADD INTERFACE, EX 10
}
