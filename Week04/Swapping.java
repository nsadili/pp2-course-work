import java.util.Arrays;
import java.util.Scanner;

public class Swapping{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] count = new int[10];

            for (int n = 0; n < count.length; n++) {
                count[n] = scanner.nextInt();
            }


   
            for(int i=0;i<count.length;i++){
                for(int j=i;j<count.length;j++){
                    if(count[i]>count[j]){
                        count[i]=count[i]+count[j];
                        count[j]=count[i]-count[j];
                        count[i]=count[i]-count[j];
                    }
                }
            }
            System.out.println(Arrays.toString(count));
        }
    }
}
