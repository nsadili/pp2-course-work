public class MinMaxElem{

public static int min(int[] arr) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}
public static int max(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}
public static void main(String[] args) {
    int[] arr = new int[args.length];
    for (int i = 0; i < args.length; i++) {
        arr[i] = Integer.parseInt(args[i]);
    }
    int min = min(arr);
    int max = max(arr);
    System.out.println("Minimum: " + min);
    System.out.println("Maximum: " + max);
}
/*public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = obj.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements: ");
    for (int i = 0; i < n; i++) {
        arr[i] = obj.nextInt();
    }
    int min = min(arr);
    int max = max(arr);
    System.out.println("Minimum element: " + min);
    System.out.println("Maximum element: " + max);
}*/
public static int[] findMinMax(int[] arr) {
    int[] res = new int[2];
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    res[0] = min;
    res[1] = max;
    return res;
}

}