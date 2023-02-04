import java.util.Scanner;
public class primes {
    public static void main(String[] args){
        var obj = new Scanner(System.in);
        int num = obj.nextInt();
        boolean isPrime = true;
        if(num%2 == 0 || num%3 == 0)
            isPrime = false;

        for(int i = 5; i * i <= num; i = i + 6){
            if(num%i == 0 || num%(i + 2) == 0){
                isPrime = false;
                break;
            }
        }
        //algorithm from stack-overflow
        System.out.printf("Number is prime:%b",isPrime);
    }

}
