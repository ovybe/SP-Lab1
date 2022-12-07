package Entity;

import Interface.Element;

import java.util.ArrayList;

public class Book extends Section{
    // responsible for Entity.Chapter
    public final ArrayList<Author> authors;
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
    public void accept(Visitor visitor){
        visitor.visitBook(this);
    }
//    public void print(){
//        System.out.println("Book: "+this.title);
//        System.out.println();
//        System.out.println("Authors:");
//        for(Author author : this.authors){
//            author.print();
//        }
//        System.out.println();
//        super.print();
//
//
//    }
}
