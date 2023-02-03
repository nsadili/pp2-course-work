 public class Calc {

    public static void main(String[] args) {

        if (args.lenght < 2){
            Systrm.out.println("Please ,enter two integers");
            System.exit(status:1);
        }

        System.out.println(args[0]);
        System.out.println(args[1]);

        System.out.println(args[0]+args[1]);
    }
 }
 