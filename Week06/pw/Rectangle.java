public class Rectangle implements Cloneable {

    private int w, h;

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public String toString() {
        return w + " " + h;
    }

    public void set(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;
        if (obj == this) return true;

        Rectangle that = (Rectangle) obj;
        return this.w == that.w && this.h == that.h;
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
    
}