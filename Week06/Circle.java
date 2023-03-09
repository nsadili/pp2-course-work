public class Circle implements Movable {
    Point o;
    int r;

    public Circle(Point o, int r) {
        this.o = o;
        this.r = r;
    }  

    public void moveUp(Object obj, int n){
        Circle c = (Circle) obj;
        c.o.moveUp(obj, n);        
    }

    public void moveDown(Object obj, int n){
        Circle c = (Circle) obj;
        c.o.moveDown(obj, n);
    }

    public void moveLeft(Object obj, int n){
        Circle c = (Circle) obj;
        c.o.moveLeft(obj, n);
    }

    public void moveRight(Object obj, int n){
        Circle c = (Circle) obj;
        c.o.moveRight(obj, n);
    }
}
