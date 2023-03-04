package geometry.figures;

public abstract class Shape {
    protected String color = new String("red");
    protected Boolean filled = true;

    public Shape(){};
    public Shape (String color, Boolean filled){
        setColor(color);
        setFilled(filled);
    }
    public String getColor() {
        return color;
    }
    public Boolean getFilled() {
        return filled;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "Shape [color = " + this.color + ", filled = " + this.filled + "]";
    }
}
