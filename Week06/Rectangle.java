package Week06;

public class Rectangle {
    int width, height;

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle that = (Rectangle)obj;
        return that.height == this.height && that.width == this.width;
    }

}