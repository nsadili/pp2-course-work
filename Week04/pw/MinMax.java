import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.print("Enter a number: ");
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for(int i = 0; i < n; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }

        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}