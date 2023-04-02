package Week05;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the Radius of Circle: It will also be considered as the side of Square");
            int r = scan.nextInt();
            System.out.println("Enter width and length of rectangle respectively:");
            int w = scan.nextInt();
            int l = scan.nextInt();
            Rectangle rec = new Rectangle(w, l);
            Square sq = new Square(r);
            Circle x = new Circle(r);
            System.out.println("The area of rectangle " + rec.getArea());
            System.out.println("The area of square " + sq.getArea());
            System.out.println("The area of Circle " + x.getArea());
            System.out.println("The perimeter of rectangle " + rec.getPerimeter());
            System.out.println("The perimeter of square is " + sq.getPerimeter());
            System.out.println("The length of circle is " + x.Length());
        }
    }
}
