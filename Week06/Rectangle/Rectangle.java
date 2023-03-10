class Rectangle implements Cloneable {
    int width, height;
    
    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle rect = (Rectangle) obj;
        return rect.width == width && rect.height == height;
    }
    
    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
