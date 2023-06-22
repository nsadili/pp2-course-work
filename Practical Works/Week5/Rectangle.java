class Rectangle {
    int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Rectangle)) {
            return false;
        }

        Rectangle rect = (Rectangle) obj;

        return width == rect.width && height == rect.height;
    }
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }
}
