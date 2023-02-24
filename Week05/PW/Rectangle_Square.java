package PW;

public class Rectangle_Square {
    public static void main(String args[]) {
        Rectangle_Square r1 = new Rectangle_Square(5, 10);
        Rectangle_Square r2 = new Rectangle_Square(15, 15);
        Rectangle_Square r3 = new Rectangle_Square(5, 10);
        Square r4 = new Square(15);
        System.out.println("Objects are identical: " + r1.equals(r2));
        System.out.println("Objects are identical: " + r1.equals(r3));
        System.out.println("Objects are identical: " + r1.equals(r4));
        System.out.println("Objects are identical: " + r2.equals(r4));

    }

    int width, height;

    public Rectangle_Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        Rectangle_Square rect = (Rectangle_Square) obj;
        return rect.height == this.height && rect.width == this.width;
    }
}

class Square extends Rectangle_Square {
    int side;

    public Square(int side) {
        super(side, side);
    }
}
