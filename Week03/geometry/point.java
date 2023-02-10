package Week03.geometry;
public class point {
    private float x;
    private float y;
    public point () {}

    public point (float x, float y ) {
        this.x = x;
        this.y = y;
    }
    public point(point p ) {
        this(p.x, p.y);
    }
    public float getx() {
        return x;
    }
    public void set(float x ) {
        this.x= x;
    }
    public float gety() {
        return y ;
    }
    public void sety(float y ) {
        this.y = y;
    }
    public void translate(float dx, float dy);{
        this.x += dx;
        this.y += dy;
    }
    public float distance ( point p) {
        float dist = (float) Math.sqrt(Math.pow(p.x - this.x)+ Math.pow(p.y -this.y),2);
        return dist;
    }
    public boolean equals( point p) {
        return this.x == p.getx() && this.y == p.gety;

    }

}
