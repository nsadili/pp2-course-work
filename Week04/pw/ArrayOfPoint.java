import java.util.Scanner;

public class ArrayOfPoint {
    int a,b ;

    public static void main(String[] args) {

        int a,b;

        ArrayOfPoint north = new ArrayOfPoint(0, Integer.MIN_VALUE);
        ArrayOfPoint south = new ArrayOfPoint(0, Integer.MAX_VALUE);
        ArrayOfPoint east = new ArrayOfPoint(Integer.MIN_VALUE, 0);
        ArrayOfPoint west = new ArrayOfPoint(Integer.MAX_VALUE, 0);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a and b coordinate");

        while (sc.hasNextInt()) {
           
            a = sc.nextInt();  b = sc.nextInt();

            if (b > north.b) {
                north.a = a;
                north.b = b;
            }
            if (b< south.b) {
                south.a = a;
                south.b = b;
            }
            if (a > east.a) {
                east.a = a;
                east.b =b;
            }
            if (a < west.a) {
                west.a = a;
                west.b = b;
            }
            System.out.println("Enter a and b coordinate");

        }

        System.out.printf("Northern most %d %d\n", north.a, north.b);
        System.out.printf("Southern most %d %d\n", south.a, south.b);
        System.out.printf("Eastern most  %d %d\n", east.a, east.b);
        System.out.printf("Western most  %d %d\n", west.a, west.b);

    } 

    public ArrayOfPoint(int a, int b) {
        this.a = a;
        this.b = b;

    }
}