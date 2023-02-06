
public class CoinTossing {
    public static void main(String[] args) { 
    
         if(args.length < 1){
            System.out.println("Enter a number:");
            System.exit(1);
         }
         var n = Integer.parseInt(args[0]);
         var a = 0;
         var b = 0;
         double res;

        for( int i = 1; i <= n; i++){

        
        res = Math.random();

        if(res < 0.5){
            a++;
             System.out.printf("%d: Head\n", i);       
        }
        else{
            b++;
             System.out.printf("%d: Tail\n", i); 
        }

        }
        System.out.println(a);
        System.out.println(b);
       


    }
    
}