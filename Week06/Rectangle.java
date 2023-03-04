package Week06;
public class Rectangle {
    int width, height;
    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rect = (Rectangle) obj;
        return width == rect.width && height == rect.height;
    }
}