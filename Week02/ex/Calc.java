public class Calc {
    
    public static void main (String [] args)  {
      if(args.length<2) {
     System.out.println("Please provide an input!");
     System.exit(1);
   }
   var num1 = Integer.valueOf(args[0]);
   var num2 = Integer.parseInt(args[1]);
   System.out.println(num1+num2);

    }
}
