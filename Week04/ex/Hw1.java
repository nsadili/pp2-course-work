public class Hw1 {
    
    public static void main(String[] args) {
        
        int min = 1000;
        int max = 0;

        int a[] = { -45, 3, 7, 112, 4, -5, 27, 33, 9, 0, 12, 0};

        for (int i = 0; i < 12; i++) {

            if (min > a[i])
            min = a[i];

            if (max < a[i])
            max = a[i];
        }

        System.out.println("The minimum value of the array: "+min);
        System.out.println("The maximum value of the array: "+max);
    }
}
