class Rectangle {
    int width, height;
  
    public Rectangle(int w, int h) {
      width = w;
      height = h;
    }
    
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
        return false;
      }
      Rectangle other = (Rectangle) obj;
      return width == other.width && height == other.height;
    }
  }
  Rectangle r1 = new Rectangle(5,10); 
  Rectangle r2 = new Rectangle(15,10); 
  Rectangle r3 = new Rectangle(5,10);
  
  System.out.println(r1.equals(r2)); // false
  System.out.println(r1.equals(r3)); // true
  