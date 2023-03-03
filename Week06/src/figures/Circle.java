package figures;

public class Circle implements Movable{
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double getR() {
        return this.r;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setR(double r) {
        this.r = r;
    }



    public void moveUp() {
        this.y++;
    }
    public void moveDown() {
        this.y--;
    }
    public void moveLeft() {
        this.x--;
    }
    public void moveRight() {
        this.x++;
    }
}
