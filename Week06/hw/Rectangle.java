public class Rectangle {
  public static void main(String args[]) {
      Rectangle R1 = new Rectangle(5, 10);
      Rectangle R2 = new Rectangle(15, 15);
      Rectangle R3 = new Rectangle(5, 10);
      Square R4 = new Square(15);
      System.out.println("Objects are identical: " + R1.equals(R2));
      System.out.println("Objects are identical: " + R1.equals(R3));
      System.out.println("Objects are identical: " + R1.equals(R4));
      System.out.println("Objects are identical: " + R2.equals(R4));

  }

  int width, height;

  public Rectangle(int width, int height) {
      this.width = width;
      this.height = height;
  }

  public boolean equals(Object obj) {
      Rectangle rect = (Rectangle) obj;
      return rect.height == this.height && rect.width == this.width;
  }
}
