import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Input number!: " );
            //int year = input.nextInt();
            //boolean LeapYear;
            var k = input.nextDouble();
            var sum = 0.0;

        for (int counter = 1; counter <= k; counter++) {
            sum += 1 / (counter + 1);
        }

        System.out.printf(".3%f\n", sum);
   
    }
}
}