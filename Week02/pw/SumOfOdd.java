import java.util.Scanner;
public class SumOfOdd {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int a= scan.nextInt();
    int b= scan.nextInt();
    int sum=0;
    int i;
    if(a<b){
    for(i=a;i<b;i++){
     if(i%2!=0){
        sum+=i;
     }
    }
    System.out.println(sum);
    
    }
    else if(a>b){
    for(i=b;i<a;i++){
        if(i%2!=0){
            sum+=i;
        }
    }
    System.out.println(sum);

    } else{
        System.out.println("Integers are same, please provide different values");
    }
    

    
}
}
