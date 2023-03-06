public abstract class Shape {
    protected String color = "red";
    protected Boolean filled = true;


    public Shape(){

    }
    public Shape(String color, Boolean filled){
        this.color=color;
        this.filled=filled;
    }
// GETTER and SETTER
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public Boolean isFilled(){
        return this.filled;
    }
    public abstract double getArea();

    public abstract double getPerimetr();

    public String toString() {
        return "Shape[color:" + color + ", filled:" + this.filled + "]";
    }

}
