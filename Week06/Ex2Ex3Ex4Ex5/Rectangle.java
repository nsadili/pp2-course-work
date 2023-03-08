package Week06.Ex2Ex3Ex4Ex5;

public class Rectangle{
    int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public boolean equals(Object obj) {
        Rectangle rect = (Rectangle) obj;
        if (this.width == rect.width && this.height == rect.height)
            return true;
        return false;
    }

    @Override
    public Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    // a. The clone() method in the Object class is protected to allow subclasses to
    // override it and provide a public cloning interface, while still keeping the
    // superclass implementation accessible.

    // b. Keeping the clone() method protected in extending classes can ensure
    // proper initialization and state copying. However, in cases where a class is
    // immutable or serves as a prototype for creating new instances, a public
    // clone() method may be appropriate.

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "h = " + height + ", w = " + width;
    }
}
