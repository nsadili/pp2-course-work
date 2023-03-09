public class Rectangle implements Cloneable {
    private int a, b;

    public Rectangle(){};

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
        Rectangle rect = (Rectangle) obj;
        if(rect.a == a && rect.b == b) return true;
        else return false;
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException{
       return (Rectangle) super.clone();
    }

}