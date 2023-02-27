class Rectangle {
    private int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

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

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);

        System.out.println(r1.equals(r2)); 
        System.out.println(r1.equals(r3));
    }
}