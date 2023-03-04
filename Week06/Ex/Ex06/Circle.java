package Ex06;

public class Circle implements Movable {
    private Point center;
    private float radius;
    public Circle(Point center,float radius){
        this.center= center;
        this.radius=radius;

    }
    public Point getCenter() {
        return center;
    }
    public void setCenter(Point center) {
        this.center = center;
    }
    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    
    @Override
    public Movable moveUp(int steps) {
         this.center.moveUp(steps);
          return this;
    }
    @Override
    public Movable moveDown(int steps) {
        this.center.moveDown(steps);
        return this;
    }
    @Override
    public Movable moveLeft(int steps) {
       this.center.moveLeft(steps);
       return this;
    }
    @Override
    public Movable moveRight(int steps) {
       this.center.moveRight(steps);
       return this;
    }
    @Override
    public String toString(){
        return ""+ this.center+"" + ", r = "+radius;
    }
   

    
}
