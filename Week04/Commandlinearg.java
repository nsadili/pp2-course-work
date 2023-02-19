package Week04;

public class Commandlinearg {
    public static void main(String[] args) {
        int sum = 0;
        for (String n: args) {
            sum += Integer.parseInt(n);
        }
        System.out.println("Sum is:" + sum);
        System.out.println("Average is:" + ((1.0)sum / args.length));
    }
}
