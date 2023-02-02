import java.util.Scanner;
class Fact {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int f = 1;
       for(int i = 1; i <= d; i++){
           f *= i;
       }
       System.out.println(f);
    }
}