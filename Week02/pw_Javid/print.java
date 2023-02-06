import java.util.Scanner;

public class print {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       int cnt=0;
        int n= input.nextInt();
        for(int j=0;j<n;j++){
        for(int i=0;i<n;i++){
            System.out.print("*");
            cnt++;
            if(cnt==n){
                System.out.println("");
                cnt=0;
                j++;
                }
            System.out.print("#");
            cnt++;
            if(cnt==n){
            System.out.println("");
            cnt=0;
            j++;
            }
            

        }
    }

    }
}
