public class Rectangle_Square1 {
    public static void main(String args[]) {
        Rectangle_Square1 R1 = new Rectangle_Square1(5, 10);
        Rectangle_Square1 R2 = new Rectangle_Square1(15, 15);
        Rectangle_Square1 R3 = new Rectangle_Square1(5, 10);
        Square R4 = new Square(15);
        System.out.println("Objects are identical: " + R1.equals(R2));
        System.out.println("Objects are identical: " + R1.equals(R3));
        System.out.println("Objects are identical: " + R1.equals(R4));
        System.out.println("Objects are identical: " + R2.equals(R4));

    }

    int width, height;

    public Rectangle_Square1(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        Rectangle_Square1 rect = (Rectangle_Square1) obj;
        return rect.height == this.height && rect.width == this.width;
    }
}

class Square extends Rectangle_Square1{
    int side;

    public Square(int side) {
        super(side, side);
    }
}