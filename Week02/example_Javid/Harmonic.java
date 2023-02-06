import java.util.Scanner;

public class Harmonic {
    
    public static void main(String[] args) {
Scanner scan= new Scanner(System.in);

  float n= scan.nextInt();
  float sum=0;
for(float i=1;i<=n ;i++){


    sum=sum + 1/i;
}

  System.out.print(sum);
    
} 

}