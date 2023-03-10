import org.w3c.dom.css.Rect;

public class Rectangle implements Cloneable {
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return a + " " + b;
    }

    public void set(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public boolean equals(Object obj){

        if(obj == null) return false;

        if(!(obj instanceof Rectangle)) return false;

        Rectangle that = (Rectangle) obj;

        return this.a == that.a && this.b == that.b;
    }
}