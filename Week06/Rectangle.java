package Week06;

public class Rectangle {
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
}
