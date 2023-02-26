import java.util.Arrays;

public class Reference {
    public static void main(String[] args){
        int[] a;
        int[] b;

        a = new int[]{1, 2, 3};
        b = new int[]{4, 5, 6};

        a[2] = 7;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}