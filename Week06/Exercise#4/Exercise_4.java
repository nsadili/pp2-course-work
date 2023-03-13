class Rectangle implements Cloneable {
    int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle rect = (Rectangle) obj;
            return (rect.width == this.width && rect.height == this.height);
        }
        return false;
    }

    public Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();  // this should not happen
        }
    }
}

public class Exercise_4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = r1.clone();

        System.out.println(r1.equals(r2));  // true
    }
}