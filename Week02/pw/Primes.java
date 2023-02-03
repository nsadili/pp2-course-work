import java.util.Scanner;
public class Primes {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int n= scan.nextInt();
    int i;
    int cnt=0;
    for(i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
           cnt++;
            
            
        }
    }
    if(cnt>0){
     System.out.println("Our number is not considered prime");
    }
    else{
        System.out.println("Our number is  prime!");
    }
       
  
    
    
    
    
    
}
}