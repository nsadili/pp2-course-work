import java.util.Scanner;

public class ArrayOfPoint {
    int x, y;

    public static void main(String[] args) {

        int x, y;

        ArrayOfPoint north = new ArrayOfPoint(0, Integer.MIN_VALUE);
        ArrayOfPoint south = new ArrayOfPoint(0, Integer.MAX_VALUE);
        ArrayOfPoint east = new ArrayOfPoint(Integer.MIN_VALUE, 0);
        ArrayOfPoint west = new ArrayOfPoint(Integer.MAX_VALUE, 0);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X and Y coordinate");
          while (sc.hasNextInt()) {
          x = sc.nextInt();
           y = sc.nextInt();
           
           if (y > north.y) {
                north.x = x;
                north.y = y;
            }
            if (y < south.y) {
                south.x = x;
                south.y = y;
            }
            if (x > east.x) {
                east.x = x;
                east.y = y;
            }
            if (x < west.x) {
                west.x = x;
                west.y = y;
            }
            System.out.println("Please enter X and Y coordinate");

        }

        System.out.printf("Northern most: %d %d\n", north.x, north.y);
        System.out.printf("Southern most: %d %d\n", south.x, south.y);
        System.out.printf("Eastern most: %d %d\n", east.x, east.y);
        System.out.printf("Western most: %d %d\n", west.x, west.y);

    }

    public ArrayOfPoint(int x, int y) {
        this.x = x;
        this.y = y;

    }
}