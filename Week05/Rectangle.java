package Week05;

class Rectangle {
    int width;
    int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
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
