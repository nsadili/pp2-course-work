import java.util.Scanner;
public class Average {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        int num;
        var sum=0;
        var cnt=0;
        while(input.hasNextInt()){
          num=  input.nextInt();
          sum+=num;
          cnt++;
        }
        var avg=(float)sum/cnt;
        System.out.println(avg);
    }
    
}
