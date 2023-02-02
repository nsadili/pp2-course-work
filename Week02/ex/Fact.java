import java.util.Scanner;

public class Fact {
   
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in); 
            if (args.length <1 ) {
                System.out.println("Please, enter 1 integer");
                System.exit(1);
            }
            var n = Integer.parseInt(args[0]);

            var f = 1L;
            var c = 1;
            while( c <= n) {
            f*=c;
            c++;
            }
            System.out.printf("%d!=%d\n",n,f);

        }
    }
    

