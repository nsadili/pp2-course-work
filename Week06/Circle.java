public class Circle implements Movable{

    private Point center;
    private double radius;

    public Circle(Point center, double radius){
        this.center=center;
        if(radius<0) radius=0;
        this.radius=radius;
    }


    @Override
    public Movable moveUp(int step) {
        center.moveUp(step);
        return this;
        
    }
    @Override
    public Movable moveDown(int step) {
        center.moveDown(step);
        return this;
       
    }
    @Override
    public Movable moveLeft(int step) {
        center.moveLeft(step);
        return this;
    }
    @Override
    public Movable moveRight(int step) {
        center.moveRight(step);
        return this;
    }

    @Override
    public String toString(){

        return center.toString() + " Radius: " + this.radius;

    }

    
}
