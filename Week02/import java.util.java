import java.util
public class main {
        public static void main(String[] args)
        { 
                Scanner in = new scanner(System.in);
                System.out.print ("Input seconds: ");
                 int seconds = in.nextInt();
                int S = seconds % 60;
                int H = seconds / 60;
                int M = H % 60;
                H = H / 60;
                System.out.print(H + ":" + M + ":" + S)
                System.out.print("\n");

        }
}
