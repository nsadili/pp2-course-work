package Week03.geometry;

public class Point {
    private float a;
    private float b;

    public Point() {
    }

    public Point(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public Point(Point p) {
        this(p.a, p.b);
    }

    public float getA() {
        return this.a;
    }

    public float getB() {
        return this.b;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void translate(float dA, float dB) {
        this.a = this.a + dA;
        this.b = this.b + dB;
    }

    public float distance(Point p) {
        return (float)Math.hypot((p.a - this.a), (p.b - this.b));
    }

    public boolean equals(Point p) {
        return this.a == p.a && this.b == p.b;
    }

}
