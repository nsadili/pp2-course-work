import java.util.Scanner;

public class PW16 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("n=");
        Point [] points = new Point[n];
        for (int i=0; i<n; i++)
        {
            System.out.println("Point number" + i);
            System.out.println("x=");
            float x= scanner.nextFloat();
            System.out.println("b =");
            float b= scanner.nextFloat();
            points[i] =  new Point (x, b);
            System.out.println("- - - - -");
        }

        Point western, eastern, northern, southern;
        western=eastern= northern= southern=points[0];
        for (int i=1; i<n;i++)
        {
            if(points[i].getX() < western.getX())
            {
                western = points[i];
            }
            if(points[i].getX() > eastern.getX())
            {
                eastern = points[i];
            }
            if(points[i].getB() < northern.getB())
            {
                northern = points[i];
            }
            if(points[i].getB()) > southern.getB())
            {
                southern = points[i];
            }
        }
        System.out.println("Western:" + western.toString());
        System.out.println("Eastern:" + eastern.toString());
        System.out.println("Northern:" + northern.toString());
        System.out.println("Southern:" + southern.toString());
     }
}
