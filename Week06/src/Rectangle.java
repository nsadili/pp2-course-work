public class Rectangle {
    int height;
    int width;

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public boolean equals(Object obj) {
        Rectangle rect = (Rectangle) obj;

        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Rectangle)) {
            return false;
        }

        return rect.width == this.width && rect.height == this.height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this.width, this.height);
    }
}
