public class Calc{
    public static void main(String [] args){
        if(args.length==0){
            System.out.println("please provide some input:");
            System.exit(1);
        }
        var num1= Integer.parseInt(args[0]);
        var num2= Integer.parseInt(args[0]);

        System.out.println(args[0]);
        System.out.println(args[1]);
    }

}