public class Circle extends Shape implements Moveable{
    protected Point center;
    protected double radius;
    protected String color;
    protected boolean filled;


    public Circle(){
        this.center=new Point(0, 0);
        this.radius=1.0;
    }
    
    public Circle(double radius){
        this.center=new Point(0, 0);
        this.radius=radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.center=new Point(0, 0);
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }    

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void moveUp(int n) {
        this.center.moveUp(n);
    }

    @Override
    public void moveDown(int n) {
        this.center.moveDown(n);

    }

    @Override
    public void moveLeft(int n) {
        this.center.moveLeft(n);

    }

    @Override
    public void moveRight(int n) {
        this.center.moveRight(n);

    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle["+super.toString()+", radius="+radius;
    }

    
}

