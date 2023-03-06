package EX;

public class ex4 {
   
public class Rectangle implements Cloneable {
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
        if(obj==null){
            return false;
        }
        if(!(obj instanceof Rectangle)){
            return false;
        }
        Rectangle rect= (Rectangle) obj;
        return this.width==rect.width && this.height==rect.height;
    
    }
    
    @Override
    public Rectangle clone() {
        try {
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
}
