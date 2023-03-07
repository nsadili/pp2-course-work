public class Main1
{
	public static void main(String[] args) {
		
	}
	
	class Rectangle{
	    int width, height;
	    
	    public Rectangle(int w, int h){
	        width = w;
	        height = h;
	    }
	    
	    public boolean equals(Object obj){
	        Rectangle rect = (Rectangle) obj;
	    }
	}
	class Square extends Rectangle{
	    int width;
	    
	    public Square(int w){
	        width = w;
	    }
	    public boolean equals(Object obj){
	        Square sqr = (Square) obj;
	    }
	}
}
