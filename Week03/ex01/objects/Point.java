package ex01.objects;

public class Point{
    private float x;
    private float y;
    public Point() {
        this(3,5);
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public float getx(){
        return this.x;
    }

    public float gety(){
        return this.y;
    }

    public void translate(float dx, float dy){
        this.x += dx;
        this.y += dy;
    }
    public float distance(Point p){
        return (float) Math.sqrt(
            Math.pow(p.getx() - this.x , 2)+
                Math.pow(p.gety() - this.y , 2));
    }
}