package EX.pw10;

public class Circle extends Point {
    private int radius;
    private Point p;
    public Circle(){}
    public Circle(int radius, Point p){
        setP(p);
        setRadius(getRadius());
    }
    public int getRadius() {
        return radius;
    }
    public Point getP() {
        return p;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setP(Point p) {
        this.p = p;
    }
    public String toString(){
        return String.format("x^2 + y^2 = %d^2", radius);
    }
    public String equals(Circle c){
        if (c.radius == radius && c.p.equals(p) == "These points are the same."){
            return "These circles are the same.";
        } return "There circles are different.";
    }
}

class Class extends Circle {
    public String toString(){
        super.toString();
        return String.format("x = %d, y = %d, r = %d", getX(), getY(), getRadius());
    }
    public String equals(Circle c){
        super.equals(c);
        if (c.getRadius() == getRadius() && c.getP().equals(getP()) == "These points are the same."){
            return "Circle 1 = Circle 2";
        } return "Circle 1 != Circle 2";
    }
}
