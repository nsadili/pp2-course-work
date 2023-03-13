package week06.classes;

public class Rectangle {
	int width, height;
	
	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
		return false;
    }
    
    public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 2);
		Rectangle r2 = new Rectangle(4, 2);
		
		System.out.println(r1.equals(r2));
//		System.out.println(r1.getWidth());
//		System.out.println(r2);
	}
    
}

