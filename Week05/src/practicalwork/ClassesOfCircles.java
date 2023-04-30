package practicalwork;
public class ClassesOfCircles {
	
    private int x;
    
    private int y;

    public ClassesOfCircles(int x, int y) {
    	
        this.x = x;
        this.y = y;
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
    public String toString() {
        return "((" + x + ", " + y + "))";
    }

    
    public boolean equals(Object obj) {
    	
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
		return false;
    }
}