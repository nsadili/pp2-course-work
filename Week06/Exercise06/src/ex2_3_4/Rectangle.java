package ex2_3_4;

class Rectangle extends Object {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        Rectangle rect = (Rectangle) obj;
        return this.width == rect.width && this.height == rect.height;
    }

    protected Rectangle clone() {
        Rectangle rect = new Rectangle(width, height);
        return rect;
    }
}
