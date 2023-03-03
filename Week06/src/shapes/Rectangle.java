package shapes;

public class Rectangle {
    int width, height;

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Rectangle other = (Rectangle) obj;
        return this.width == other.width && this.height == other.height;
    }

    @Override
    protected Rectangle clone() {
        return new Rectangle(this.width, this.height);

    }

    @Override
    public String toString() {
        return "Rectangle(" + this.width + ", " + this.height + ")";
    }
}
