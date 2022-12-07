package Entity;

public class RenderContentVisitor implements Visitor{

    @Override
    public void visitBook(Book book) {
        System.out.println("Book: "+book.title);
        System.out.println();
        System.out.println("Authors:");
        for(Author author : book.authors){
            author.print();
        }
        System.out.println();
    }

    @Override
    public void visitSection(Section section) {
        System.out.println(section.title);
        for(int i=0;i<section.children.size();i++){
            section.get(i).accept(this);
        }
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        System.out.println("Table of Contents");
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        if(paragraph.textAlignment==null){
            System.out.println("Paragraph: "+paragraph.text);
        }
        else
            System.out.println("Paragraph: "+paragraph.textAlignment.render(paragraph));
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        visitImage(imageProxy.loadimage());
    }

    @Override
    public void visitImage(Image image) {
        System.out.println(image.url);
    }

    @Override
    public void visitTable(Table table) {
        System.out.println("Table with title: "+table.title);
    }
}
