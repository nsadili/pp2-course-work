import java.util.Scanner;

public class Fact {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        var res = 1;

        while (1 < i) {

            res = res * i;
            i--;

        }

       System.out.println(res);

    }

    

    
    

}
