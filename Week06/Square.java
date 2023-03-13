package Week06;

public class Square {
    public class Square extends Rectangle {
        public Square(int side) {
            super(side, side);
        }
    }
    Rectangle rectangle = new Rectangle(5, 10);
    Square square = new Square(5);
    
    System.out.println(rectangle.equals(square)); // prints false
    System.out.println(square.equals(rectangle)); // prints false
    
    Square square2 = new Square(10);
    
    System.out.println(square.equals(square2)); // prints false
    
    Rectangle rectangle2 = new Rectangle(10, 10);
    
    System.out.println(square2.equals(rectangle2)); // prints true
}
