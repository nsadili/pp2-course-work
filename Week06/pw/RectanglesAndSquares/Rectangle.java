package RectanglesAndSquares;
public class Rectangle {
    int width;
    int height;
    

    public Rectangle(int w, int h) {

        this.height = w;
        this.width = h;
    }


    public boolean equals(Object obj) {

        Rectangle rect = (Rectangle) obj;

        return (width == rect.width && height == rect.height);

    }

}

class Square extends Rectangle {

      public Square(int side) {

        super(side, side);

        this.height = side;
        this.width = side;
      }
}