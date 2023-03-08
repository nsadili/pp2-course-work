import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int a[] = { -45, 3, 7, 112, 4, -5, 27, 33, 9, 0, 12, 0};
        int max = a[0];
        int min= a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max) {
           max=a[i];
         }
         if(a[i]<min) {
            min=a[i];
         }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
        