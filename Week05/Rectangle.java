package Week05;

public class Rectangle {
    int width, height;
    public Rectangle(int w, int h){
        width = w;
        height = h;
    }

    public boolean equals(Object obj){
        Rectangle rect = (Rectangle) obj;
        return rect.width == this.width && rect.height == this.height;
    }
}

