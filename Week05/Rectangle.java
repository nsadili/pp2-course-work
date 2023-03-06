package Week05;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int calculateArea()
    {
        return this.a * this.b;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}