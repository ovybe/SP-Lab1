package Entity;

public class AlignRight implements AlignStrategy{
    String align="##";
    @Override
    public String render(Paragraph paragraph) {
        return paragraph.getText()+align;
    }
}
