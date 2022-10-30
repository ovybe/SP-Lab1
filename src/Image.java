public class Image {
    private String imageName;
    public Image(String name){
        this.imageName=name;
    }
    public void print(){
        System.out.println("Image with name: "+this.imageName);
    }
}
