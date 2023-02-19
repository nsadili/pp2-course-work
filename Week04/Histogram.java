import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        int median, mode, students;
        Scanner input = new Scanner(System.in);
        students = input.nextInt();
        int[] arr = new int[students];
        int counter[] = new int[11];
        for (int i = 0; i < students; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < students; i++) {
            for (int j = 0; j <= 10; j++) {
                if (arr[i] == j) {
                    counter[j]++;
                }
            }
        }
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d:", i);
            //for (int j = 0; j < 11; j++) {
                while (counter[i] > 0) {
                    System.out.printf("%c", '*');
                    counter[i]--;
                }
                System.out.println("");
            }
        }
    }
//}
