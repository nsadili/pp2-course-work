

public class Calc{
    public static void main(String[] args){
        if(args.length < 3)
        {
            System.out.println("Please provide some input!");
            System.exit(1);
        }
        int a = Integer.parseInt(args[0]);  
        int b = Integer.parseInt(args[2]);
        String ch = args[1];
        int c = 0;

        switch (ch){
            case "+":
                c = a  + b;
                break;
            case "-":
                c = a - b ;
                break;
            case "*":
                c = a * b ;
                break;
            case "/":
                c = a / b ;
                break;
            case "%":
                c = a % b;
                break;
        }
        System.out.println("Result is : " +c);
            
        }
    }
               