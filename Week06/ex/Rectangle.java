public class Rectangle implements Cloneable {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle rect = (Rectangle) obj;
        return rect.height == this.height && rect.width == this.width;
    }

    public Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String args[]) {
        Rectangle R1 = new Rectangle(5, 10);
        Rectangle R2 = R1.clone();
        System.out.println("R1: " + R1.width + ", " + R1.height);
        System.out.println("R2: " + R2.width + ", " + R2.height);
        System.out.println("R1 == R2: " + (R1 == R2));
        System.out.println("R1.equals(R2): " + R1.equals(R2));
    }
}
