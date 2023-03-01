public class Rectangle {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return width == other.width && height == other.height;
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
        Rectangle r = new Rectangle(5, 10);
        Square s = new Square(5);

        System.out.println(r.equals(s)); // should print "false"
        System.out.println(s.equals(r)); // should print "false"
    }
}
