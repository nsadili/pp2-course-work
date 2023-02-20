import java.util.Scanner;

public class TheEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        //System.out.println(findPrime(n));
        int [] res=findPrime(n);
        for (int i=1; i<=n; i++){
            if (res[i]==1) System.out.println(i);
        }

    }

    public static int[] findPrime(int n){
        int[] ones= new int[n+1];

        for (int i=2; i<=n; i++){
            ones[i]=1;
        }

        for (int i=2; i<=n; i++){
            if(ones[i]==1) {
                for (int j=i*2; j<=n; j+=i){
                    ones[j]=0;
                }
            }
        }
        
        return ones;
    }
}

