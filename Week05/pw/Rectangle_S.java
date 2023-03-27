public class Rectangle_S {
    public static void main(String args[]) {
        Rectangle_S R1 = new Rectangle_S(5, 10);
        Rectangle_S R2 = new Rectangle_S(15, 15);
        Rectangle_S R3 = new Rectangle_S(5, 10);
        Square R4 = new Square(15);
        System.out.println("Objects are identical: " + R1.equals(R2));
        System.out.println("Objects are identical: " + R1.equals(R3));
        System.out.println("Objects are identical: " + R1.equals(R4));
        System.out.println("Objects are identical: " + R2.equals(R4));

    }

    int width, height;

    public Rectangle_S(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        Rectangle_S rect = (Rectangle_S) obj;
        return rect.height == this.height && rect.width == this.width;
    }
}

class Square extends Rectangle_S{
    int side;

    public Square(int side) {
        super(side, side);
    }
}