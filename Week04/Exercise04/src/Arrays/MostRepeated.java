package Arrays;
import java.util.Arrays;

public class MostRepeated {
    public static void main(String args[]) {
        int n = 52836553;
        int cnt[] = new int[10];

        while (n > 0) {
            cnt[n%10]++;
            n /= 10;
        }

        int max = cnt[0];
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > max) max = cnt[i];
        }

        System.out.println(Arrays.toString(cnt));
        System.out.println(indexOf(cnt, max));
    }

    public static int indexOf(int arr[], int el) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                return i;
            }
        }
        return -1;
    }
}
