package Week05.src;

class Rectangle {
    int height, width;

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rect = (Rectangle) obj;
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Rectangle)) {
            return false;
        }
        
        return rect.width == this.width && rect.height == this.height;
    }
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    public static void main(String[] args) {
        Object o1 = new Rectangle(5, 10);
        Object o2 = new Rectangle(15, 15);
        Object o3 = new Square(15);

        System.out.println("Objects are identical: " + o1.equals(o2));
        System.out.println("Objects are identical: " + o1.equals(o3));
        System.out.println("Objects are identical: " + o2.equals(o3));
    }
}
