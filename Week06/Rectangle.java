package Week06;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Rectangle rect = (Rectangle) obj;
        return width == rect.width && height == rect.height;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);

        System.out.println(r1.equals(r2)); // false
        System.out.println(r1.equals(r3)); // true
    }
}
