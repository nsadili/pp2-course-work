package pw11;
public class Rectangle {
    int width, height;
    public Rectangle (int w, int h){
        width=w;
        height=h;
    }
    public boolean equals(Object obj){
        Rectangle rectangle = (Rectangle) obj;
        return rectangle.height== this.height && rectangle.width == this.width;
    }
}
