public class MinMax{
    public static void main(String[] args) {
        int arr[]={-45, 3, 7,112, 4, -5, 27, 33, 9, 0, 12,0};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max) max=arr[i];
            if (arr[i]<min) min=arr[i];
        }
        System.out.println("min: "+ min + "\nmax: "+ max);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
