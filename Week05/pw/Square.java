public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return this.width == other.width && this.height == other.height;
        }
        return false;
    }
}

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }
}

public class Main {
    public static void main(String[] args) {
        Object o1 = new Rectangle(5, 10);
        Object o2 = new Rectangle(15, 15);
        Object o3 = new Square(15);
        System.out.println("Object are identical: " + o1.equals(o2));
        System.out.println("Object are identical: " + o1.equals(o3));
        System.out.println("Object are identical: " + o2.equals(o3));
    }
}