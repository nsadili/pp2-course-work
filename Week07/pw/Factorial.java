import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        while (scan.hasNextInt()) {
            num = scan.nextInt();
        
        try{
            System.out.printf("%d! is %d\n", num, factorial(num));
        }catch(IllegalArgumentException a){
            //System.out.println(a.getMessage());
            a.printStackTrace(); //shows where the problem exists
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
            
        }

        scan.close();
    }

    static int factorial(int n) throws IllegalArgumentException{
        if (n<0){
            throw new IllegalArgumentException( // as it is checked exception, we have to specify.
                String.format("%d is negative!", n)
            );
        }

        if (n == 0 || n == 1)
            return 1;

        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;

        return f;
    }
}