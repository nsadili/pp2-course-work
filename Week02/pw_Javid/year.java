import java.util.Scanner;


public class year {
    
    public static  void main(String[] args){
        Scanner scan =new Scanner(System.in);

        var i =scan.nextInt();
    

        if(i%4==0){
         System.out.println("It is leap year2");
        }
        else{
            System.out.println("It is not leap year");
        }
        
    }
    
}
