package Ex07;

public abstract class Shape {
    protected String color= "red";
    protected boolean filled = true;
    public Shape(){
    }
    public Shape(String color, boolean filled){
        this.color= color;
        this.filled= filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();

    public String toString(){
        return "Shape[color=" + color +", filled=" + filled +"]";
    }
    


    
}
