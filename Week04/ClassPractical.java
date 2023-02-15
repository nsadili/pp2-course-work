package Week04;
import java.util.Arrays;
public class ClassPractical {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n = 1234567;
        while (n > 0) {
            arr[n % 10] += 1;
            n = n / 10;
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 0; i <arr.length; i++){
            if (arr[i]>max){
            }
        }
        System. out.println(max);
        System.out.println(indexOf(arr,max));
    }
    public static int indexOf(int arr[],int element){
        int index = -1;
        for (int i = 0; i <arr.length; i++){
            if(arr[i] == element){
                 index = i;
            }
        }
        return index;
    }

}

