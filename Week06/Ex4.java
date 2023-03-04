package Week06;

public class Ex4{
    class Main {
        public static void main(String[] args) {
            Rectangle r1 = new Rectangle(5, 10);
            Rectangle r2 = new Rectangle(15, 10);
            Rectangle r3 = new Rectangle(5, 10);
            
            System.out.println(r1.equals(r2)); 
            System.out.println(r1.equals(r3)); 
        }

    public static class Rectangle implements Cloneable {
    private int width, height;

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Rectangle)) {
            return false;
        }

        Rectangle rect = (Rectangle) obj;
        return this.width == rect.width && this.height == rect.height;
    }

    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}

    }
}

/* a) The clone() method has protected visibility in the Object class to prevent misuse of the cloning mechanism.
 * b) The benefit of keeping the clone() method protected in the extending class is to ensure that only subclasses and their members can access and override the method.
 */
