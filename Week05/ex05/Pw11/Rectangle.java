package Pw11;

class Rectangle {
    private int width;
    private int height;

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean equals(Object obj) {
        Rectangle rect = (Rectangle) obj;
        
        if(obj == this) {
            return true;
        }
        if(obj.getClass() != getClass()) {
            return false;
        }
        return (this.width == rect.width && this.height == rect.height);

    }
    public static void main(String[] args) {
    Rectangle r1 = new Rectangle(5, 10);
    Rectangle r2 = new Rectangle(15, 10);
    Rectangle r3 = new Rectangle(5, 10);

    System.out.println(r1.equals(r2));
    System.out.println(r1.equals(r3));
    }
}
