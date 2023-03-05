public class Rectangle {
    private int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public void set(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (!(obj instanceof Rectangle))
            return false;

        Rectangle that = (Rectangle) obj; // downcasting

        return this.a == that.a && this.b == that.b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
    
}
