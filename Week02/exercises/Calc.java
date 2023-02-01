public class Calc {
    public static void main (String[] args){
        if (args.length < 2){
            System.out.println("Please, provide an input!");
            System.exit (1);
        }
        System.out.println(args[0]);
        System.out.println(args[1]);       
        var num1 = Integer.valueof(args[0]);
        var num2 = Integer.valueof(args[1]);
        
    }
    
}
