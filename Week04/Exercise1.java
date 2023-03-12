public class Exercise1 {
    public static void main(String[] args) {

        if (args.length == 0) {

            System.out.println("Enter a value!: ");
            System.exit(1);

        }

        for (int i = 0; i < args.length; i++) {

            System.out.println(args[i]);

        }
    }
}