public class Calc {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Please enter numbers");
            System.exit(1);
        }
        
       var x=Integer.parseInt(args[0]);
       var y=Integer.valueOf(args[1]);

       System.out.println("Sum: "+(x+y));
       System.out.println("Substraction: "+(x-y));
       System.out.println("Division: "+(x/y));
       System.out.println("Remainder: "+(x%y));
}
}
