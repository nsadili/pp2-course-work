package Week06;

public class Rectangle extends Shape implements Resizable {
    private int width;
    private int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    @Override
    public boolean equals(Object obj) {
        Rectangle rect = (Rectangle) obj;
        if (rect == this) {
            return true;
        }
        
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        
        Rectangle other = (Rectangle) obj;
        return this.width == other.width && this.height == other.height;
    }

    protected Rectangle clone(){
        try {
            return (Rectangle) super.clone();
        }
        catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
    public static void main(String[] args){
            Rectangle r1 = new Rectangle(5, 10);
            Rectangle r2 = new Rectangle(15,10);
            Rectangle r3 = new Rectangle(5, 10);

            System.out.println(r1.equals(r2));
            System.out.println(r1.equals(r3));

    }

    @Override
    public void resize() {
        // TODO Auto-generated method stub
        height = 1;
        width = 1;
        // throw new UnsupportedOperationException("Unimplemented method 'resize'");
    }

    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return height*width;
        // throw new UnsupportedOperationException("Unimplemented method 'getArea'");
    }

    @Override
    double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * (height + width);
        // throw new UnsupportedOperationException("Unimplemented method 'getPerimeter'");
    }
    

    @Override
    public String toString(){
        return "Rectangle[" +super.toString() + "width = " +width+ ", length = " +height+ "]";
    }
    
}
