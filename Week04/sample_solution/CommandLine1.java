public class CommandLine1 {

    public static void main(String[] args) {

        // JVM invokes the main method
        // args: Command line arguments

        System.out.println("Length of input: " + args.length);

        // token = args[0];
        // token = args[1];
        // token = args[2];
        // .....
        // token = args[args.length - 1];

        // for (String token : args) { // for read-only operations
        // System.out.println(token);
        // }

        for (int i = 0; i < args.length; i++) { // for read-modify operations
            String token = args[i];
            System.out.println(token);
        }

    }

}