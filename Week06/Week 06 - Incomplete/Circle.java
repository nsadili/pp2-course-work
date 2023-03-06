public class Circle extends Shape implements Movable{
    private Point center;
    protected double radius= 1.0;

    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    //GETTER and SETTER
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return Math.PI * (this.radius*this.radius);
    }
    public double getPerimetr(){
        return 2*Math.PI*this.radius;
    }
    @Override
    public String toString() {
        return "Circle[Shape[color="+getColor()+", filled="+this.filled+"], radius="+getRadius()+"]";
    }

    //MOVABLE
    @Override
    public Movable moveUp(int a) {
        center.moveUp(a);
        return this;
    }
    @Override
    public Movable moveDown(int a) {
        center.moveDown(a);
        return this;
    }
    @Override
    public Movable moveLeft(int a) {
        center.moveLeft(a);
        return this;
    }

    @Override
    public Movable moveRight(int a) {
        center.moveRight(a);
        return this;
    }
}
