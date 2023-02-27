package Week05;

public class Circle extends Rectangle{
    private int radius;

    public Circle(int m) {
        super(m, m);
        this.radius = m;
    }

    
    public double getArea(){
        return  (2 * (Math.PI * Math.pow(this.radius, 2)));
    }

    public double Length(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString(){
        return "[Radius : " + this.radius + "]";
    }
}