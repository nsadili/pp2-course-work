package RectanglePw11;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public boolean equals(Object obj) {
        Rectangle rect = (Rectangle) obj;
        
        if(width == rect.width && height == rect.height)
        return true;
        else
        return false;
    }
}
