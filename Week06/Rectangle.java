public class Rectangle extends Shape implements Cloneable, Resizable{
    protected double width = 1.0;
    protected double height = 1.0;

    public Rectangle(){
        super();
    }

    public Rectangle(double width, double height){
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public void set(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean equals(Object obj) {
        if(obj == null)
        return false;

        if(!(obj instanceof Rectangle)) 
        return false;
        
        Rectangle that = (Rectangle) obj;

        return this.width == that.width && this.height == that.height;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
    
    public double getArea(){
        return height * width;
    }

    public double getPerimeter(){
        return 2 * (height + width);
    }
    public String toString() {
        return "Rectangle[Shape[color=" + color 
        + ", filled=" 
        + filled + "], width=" 
        + width + ", height=" 
        + height + "]"; 
    }
    @Override
    public Resizable resize() {
        this.height *= width;
        this.width *= height;
        return this;
}

}