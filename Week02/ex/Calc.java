public class Calc {
    public static void main(String[] args){ //args is array
        
        if(args.length < 2){
            System.out.println("Please, enter two integers");
            System.exit(1);
        }
        System.out.println(args[0]);
        System.out.println(args[1]);

        var a = Integer.parseInt(args[0]); // if it is float Float.parseFloat
        var b = Integer.valueOf(args[0]);

        System.out.println(a+b);

    }

}
