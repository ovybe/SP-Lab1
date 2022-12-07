package Entity;

public class BookStatistics implements Visitor{
    int numberBooks,numberImages,numberTables,numberParagraphs,numberTableOfContents;
    public BookStatistics(){
        numberBooks=0;
        numberImages=0;
        numberTables=0;
        numberParagraphs=0;
        numberTableOfContents=0;
    }
    public void visitBook(Book book) {
        numberBooks++;
    }

    public void visitSection(Section section) {
        for(int i=0;i<section.children.size();i++){
            section.get(i).accept(this);
        }
    }

    public void visitTableOfContents(TableOfContents tableOfContents) {
        numberTableOfContents++;
    }

    public void visitParagraph(Paragraph paragraph) {
        numberParagraphs++;
    }

    public void visitImageProxy(ImageProxy imageProxy) {
        visitImage(imageProxy.loadimage());
    }

    public void visitImage(Image image) {
        numberImages++;
    }

    public void visitTable(Table table) {
        numberTables++;
    }
    public void printStatistics(){
        System.out.println("Book statistics:");
        System.out.println("*** Number of Images: "+numberImages);
        System.out.println("*** Number of Tables: "+numberTables);
        System.out.println("*** Number of Paragraphs: "+numberParagraphs);
    }
}
