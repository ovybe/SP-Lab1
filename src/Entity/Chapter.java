package Entity;

import java.util.ArrayList;
import java.util.Collection;

public class Chapter {
    private String name;
    ArrayList<SubChapter> subChapters;
    public Chapter(String chapterName){
        this.name=chapterName;
        this.subChapters=new ArrayList<SubChapter>();
    }
    public int createSubChapter(String name){
        SubChapter subChapter = new SubChapter(name);
        this.subChapters.add(subChapter);
        return this.subChapters.indexOf(subChapter);
    }
    public SubChapter getSubChapter(int index){
        return this.subChapters.get(index);
    }
    public void print(){
        System.out.println("Subchapter: "+this.name);
        for(SubChapter sc : this.subChapters){
            sc.print();
        }
    }
}
