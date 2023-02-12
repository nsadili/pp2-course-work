public class PolarityOfNumber {
    
    public static void main(String[] args) {

       double num = Double.parseDouble(args[0]);

       if  (num > 0.0) 
       System.out.println("The number " + num + " is positive. ");
       else if (num < 0.0)
       System.out.println("The number " + num + " is negative. ");
       else 
       System.out.println("The number " + num + " is neutral. ");
    }
}