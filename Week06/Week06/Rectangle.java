package Week06;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }
    public String toString() {
        return "[" + width+ "," + height + "]";
     }
}
