public class Rectangle {
    int width, height;

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle rect = (Rectangle)obj;
            return rect.height == this.height && rect.width == this.width;
        }
        return false;
    }
}