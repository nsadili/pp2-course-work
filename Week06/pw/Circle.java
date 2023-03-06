public  class Circle extends Shape implements Movable {
    private Point c;
    private double r = 1.0;
    public Circle(){

    }
    public Circle(Point center, double radius) {
        this.c = center;
        this.r = radius;
    }
    public Circle(double r, String color, boolean filled){
        this.r=r;
        this.color = color;
        this.filled = filled;
    }
    public Point getC() {
        return c;
    }
    public void setC(Point c) {
        this.c = c;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }


    public double getArea(){
        
     return Math.PI * r * r;
    }
    public double getPerimeter(){
        return 2 * Math.PI * r;
    }
    @Override
    public String toString(){
        
        return "Shape[color=" + color + ", filled=" + filled + ", radius=" + r + "]";
    }
    @Override
    public Movable moveUp(int steps) {
        this.c.moveUp(steps);
        return this;
    }

    @Override
    public void moveDown() {
        this.c.moveDown();
    }

    @Override
    public void moveLeft() {
        this.c.moveLeft();
    }
    
    @Override
    public void moveRight() {
        this.c.moveRight();
    }
    
}
    


