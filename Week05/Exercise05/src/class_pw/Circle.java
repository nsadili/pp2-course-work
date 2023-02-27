package class_pw;

public class Circle extends Square {
    private int rad;

    public Circle(int rad) {
        super(rad);
    }

    @Override
    public int calcArea() {
        return (int)Math.PI * this.rad * this.rad;
    }

    public int getRadius() {
        return this.rad;
    }

    public void setRadius(int rad) {
        this.rad = rad;
    }

    
}
