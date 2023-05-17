import java.util.Scanner;

public class Reverse {
    public static void main(String [] args){
        try (Scanner scn = new Scanner(System.in)) {
            int i;
            
            int n= scn.nextInt();
            int[] arr = new int[10];  
      
            for( i=1; i<=n; i++)  
            {    
            arr[i]=scn.nextInt();  
            }  
            for (i=n; i>=1;i--){
                System.out.print(arr[i]);
            }
        }

    }
}
