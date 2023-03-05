package Week05.PW_10;

class Point {
    private double x, y;
    
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        return String.format("x = %.2f, y = %.2f", getX(), getY());
    }
    
    public boolean equals(Point p) {
        if (p.getX() == this.getX() && p.getY() == this.getY()) {
            return true;
        } else {
            return false;
        }
    }
}

class point extends Point {
    public String toString(){
        super.toString();
        return String.format("x = %.2f, y = %.2f", getX(), getY());
    }
    
    public String equals(point p){
        super.equals(p);
        if (p.getX() == this.getX() && p.getY() == this.getY()) 
            return "p1 equals to p2";
        return "p1 not equals to p2";
    }
}

public class Main {
    public static void main(String[] args) {
        point p1 = new point();
        point p2 = new point();
        p1.setPoint(4, 5);
        p2.setPoint(1, 6);
        System.out.print(p1.toString() + "\n");
        System.out.print(p2.toString() + "\n");
    }
}
