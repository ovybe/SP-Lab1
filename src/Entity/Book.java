package Entity;

import Entity.Author;
import Interface.Element;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    // responsible for Entity.Chapter
    private ArrayList<Author> authors;
    public Book(String title){
        super(title);
        this.authors= new ArrayList<>();
    }
    public void addAuthor(Author author){
        this.authors.add(author);
    }
    public void addContent(Element el){
        super.add(el);
    }
    public void print(){
        System.out.println("Book: "+this.title);
        System.out.println();
        System.out.println("Authors:");
        for(Author author : this.authors){
            author.print();
        }
        System.out.println();
        super.print(false);


    }
}
