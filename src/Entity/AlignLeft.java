package Entity;

public class AlignLeft implements AlignStrategy{
    String align="##";
    @Override
    public String render(Paragraph paragraph) {
        return align+paragraph.getText();
    }
}
