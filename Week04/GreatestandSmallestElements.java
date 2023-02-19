package Week04;
import java.util.Scanner;
public class GreatestandSmallestElements {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please give the number of elements you want to input: ");
int n = sc.nextInt();
int[] array = new int [n];
for (int i = 0; i<n; i++){
 array[i] = sc.nextInt();
}
System.out.println(minimum(array));
System.out.println(maximum(array));

}
private static int minimum(int[] array) {
    int min = array[0];
    for (int x: array){
    if ( x < min) min = x;
}
return min;
}
public static int maximum(int[]array){
    int max = array[0];
    for (int x: array){
    if ( x > max) max = x;

}

return max;
}
}
