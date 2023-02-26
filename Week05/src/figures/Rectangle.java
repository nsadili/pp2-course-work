package figures;

public class Rectangle {
    int width, height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
            Rectangle r = (Rectangle) obj;
            return this.width == r.width && this.height == r.height;
    }
}
