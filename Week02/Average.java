import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x[] = new double[999];
        int i = 0;
        double average = 0;
        System.out.println("Add the numbers : ");
        do {
            x[i++] = sc.nextDouble();
        } while(sc.hasNextDouble());
            for (int j = 0; j < i; j++) {
                average += (x[j] / i);
            }
            System.out.println("The average is: " + average);
sc.close();
    }
}

