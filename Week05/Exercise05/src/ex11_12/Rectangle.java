package ex11_12;

class Rectangle {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        Rectangle rect = (Rectangle) obj;
        if (this.height == rect.height && this.width == rect.width)
            return true;
        return false;
    }
}