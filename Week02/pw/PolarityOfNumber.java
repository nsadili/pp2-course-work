public class PolarityOfNumber {
    public static void main(String[] args) {
        
        double number = Double.parseDouble(args[0]);

        if (number < 0) System.out.println("negative");

        if (number > 0) System.out.println("positive");

        if (number == 0) System.out.println("neutral");
    }
}
