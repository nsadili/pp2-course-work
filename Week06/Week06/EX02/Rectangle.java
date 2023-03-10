package Week06.EX02;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Rectangle)) {
            return false;
        }

        Rectangle other = (Rectangle) obj;

        return width == other.width && height == other.height;
    }
}
