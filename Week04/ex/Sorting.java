import java.util.*;;

public class Sorting {
    public static void sort(char a[]){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
               if (a[i] > a[j]) {
                  char b = a[i];
                  a[i] = a[j];
                  a[j] = b;
               }
            }
         }
        System.out.print(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] a= word.toCharArray();
        sc.close();
        sort(a);
    }
}
