package Week06;
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

    public boolean equals(Object obj) {  
        if (obj == null)
            return false;
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle robj = (Rectangle) obj;
        return robj.a == this.a && robj.b == this.b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
