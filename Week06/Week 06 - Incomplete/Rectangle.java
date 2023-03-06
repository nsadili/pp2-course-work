package Rectangle;

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
        if (obj==null) return false;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle rect = (Rectangle) obj;
        return (this.a==rect.a) && (this.b==rect.b);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
        // Using protected access modifier promotes encapsulation and code reuse in object-oriented programming,
        //  while public access should be used when unrestricted access to a member is needed.
    }

}
