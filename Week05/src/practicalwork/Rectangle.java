package practicalwork;

public class Rectangle {
	
    int width, height;

    public Rectangle(int width, int height) {
    	
        this.width = width;
        
        this.height = height;
    }
    
    public int getWidth(){
    	return width;
    }
    
    public int  getHeight(){
    	return height;
    }
    
    @Override
    
    

    public boolean equals(Object obj) {
    	
    	Rectangle ract = (Rectangle) obj;
    	
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Rectangle)) {
            return false;
        }

        Rectangle other = (Rectangle) obj;

        return this.width == other.width && this.height == other.height;
    }
    
}