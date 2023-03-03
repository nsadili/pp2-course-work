class Rectangle {
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
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }
}

public class Main {
    public static void main(String[] args) {
        Object o1 = new Rectangle(5, 10);
        Object o2 = new Rectangle(15, 15);
        Object o3 = new Square(15);
        
        System.out.println("Objects are identical: " + o1.equals(o2)); // false
        System.out.println("Objects are identical: " + o1.equals(o3)); // false
        System.out.println("Objects are identical: " + o2.equals(o3)); // true
    }
}
