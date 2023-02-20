package Arrays;
import java.util.Arrays;

public class ex3 {

    public static String theThreeMs(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }

        int med;
        if (arr.length % 2 == 0)
            med = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
        else
            med = arr[arr.length / 2];

        int mod = -1;
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int cnt = 0;
            while (arr[i] == arr[i + 1]) {
                cnt++; i++;
            }
            if (cnt > max) {
                max = cnt;
                mod = arr[i];
            }
        }

        int mean = 0;
        for (int x: arr) {
            mean += x;
        }
        mean /= arr.length;

        if (mod == -1)
            return String.format("Mean: %d\nMedian: %d\nMode: none", mean, med);
        return String.format("Mean: %d\nMedian: %d\nMode: %d", mean, med, mod);
    }

    public static void main(String args[]) {
        int grades[] = {5, 0, 10, 5, 4, 3, 9, 7, 5, 1, 0, 2, 6, 7, 3, 4, 8, 6 , 9, 2};
        int zero = 0; int one = 0; int two = 0; int three = 0; int four = 0; int five = 0; int six = 0;
        int seven = 0; int eight = 0; int nine = 0; int ten = 0;

        for (int x: grades) {
            switch (x) {
            case(0): zero++; break;
            case(1): one++; break;
            case(2): two++; break;
            case(3): three++; break;
            case(4): four++; break;
            case(5): five++; break;
            case(6): six++; break;
            case(7): seven++; break;
            case(8): eight++; break;
            case(9): nine++; break;
            case(10): ten++; break;
            }
        }
        
        System.out.println("0: " + zero);
        System.out.println("1: " + one);
        System.out.println("2: " + two);
        System.out.println("3: " + three);
        System.out.println("4: " + four);
        System.out.println("5: " + five);
        System.out.println("6: " + six);
        System.out.println("7: " + seven);
        System.out.println("8: " + eight);
        System.out.println("9: " + nine);
        System.out.println("10: " + ten);

        System.out.println(theThreeMs(grades));
    }
}
