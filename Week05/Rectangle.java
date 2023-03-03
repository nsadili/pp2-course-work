class Rectangle {
    int width, height;
    
    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) { // check if the object is itself
            return true;
        }
        if (!(obj instanceof Rectangle)) { // check if the object is not a Rectangle
            return false;
        }
        Rectangle rect = (Rectangle) obj; // cast the object to a Rectangle
        return rect.width == width && rect.height == height; // check if the width and height are the same
    }
}
