import java.util.Scanner;

public class pw1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a = new int[n];    
}
}
public static int minimum(int[] a){
    int mn =a[0];
    for (int x: a){
        if(x<mn) mn=x;
    } return mn;

}
public static int maximum(int[] a){
    int mx=a[0]; 
    for(int x: a){
      if(x>mx)   mx=a[0];
    } return mx;
   System.out.println(mn);
   System.out.println(mx);
}