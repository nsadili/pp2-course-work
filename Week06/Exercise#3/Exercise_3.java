class Rectangle {
    int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle rect = (Rectangle) obj;
            return width == rect.width && height == rect.height;
        }
        return false;
    }
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }
}

public class Exercise_3 {
    public static void main(String[] args) {
        Object o1 = new Rectangle(5,10);
        Object o2 = new Rectangle(15, 15);
        Object o3 = new Square(15);

        System.out.println("Objects are identical: " + o1.equals(o2));
        System.out.println("Objects are identical: " + o1.equals(o3));
        System.out.println("Objects are identical: " + o2.equals(o3));
    }
}