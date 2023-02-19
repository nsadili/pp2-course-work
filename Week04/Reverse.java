import java.util.Scanner;

public class Reverse {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in); 
        
        int i;
        
        int n= sc.nextInt();
        int[] arr = new int[10];  
       
        for( i=1; i<=n; i++)  
        {  
        //reading array elements from the user   
        arr[i]=sc.nextInt();  
        }  
        for (i=n; i>=1;i--){
            System.out.print(arr[i]);
        }

    }
}
