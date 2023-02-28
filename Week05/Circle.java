public class Circle extends Square {

    private int radius;

    public Circle(int radius)
    {
        super(radius);
        this.radius = radius; 
    }

   
    public int getSide() {
        return radius;
    }

    public void setSide(int radius) {
        this.radius = radius;
    }
    
    
}
