public class Fact {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Please enter a number");
            return;
        }

        var num = Integer.parseInt(args[0]);
        var fact = 1;
        var i = 1;
        
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
    
    }