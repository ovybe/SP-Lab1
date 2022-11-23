package Entity;

public class AlignCenter implements AlignStrategy{
    String align="##";
    @Override
    public String render(Paragraph paragraph) {
        return align+paragraph.getText()+align;
    }
}
