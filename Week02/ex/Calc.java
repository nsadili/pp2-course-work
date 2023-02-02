public class Calc {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("Please enter numbers");
            System.exit(1);
        }
        
       var a=Integer.parseInt(args[0]);
       var b=Integer.valueOf(args[1]);

       System.out.println("Sum: "+(a+b));
       System.out.println("Substraction: "+(a-b));
       System.out.println("Division: "+(a/b));
       System.out.println("Remainder: "+(a%b));
    
    }
}
