public class Calc {
 public static void main(String[] args) {
    if(args.length<2)
    System.out.println("Enter 2 number:");
    System.exit(1);
 } 
 System.out.println(args[0]);
 System.out.println(args[1]);


 int a=Integer.parseInt(args[0]);
 int b=Integer.parseInt(args[1]);
 System.out.println(a+b);
 System.out.println(a-b);
 System.out.println(a*b);
 System.out.println(a/b);
 System.out.println(a%b);
}
