public class MinimumMax {
    public static void main(String[] args){
        int[] a;
        a = new int[]{-45, 3, 7, 112, 4, -5, 27, 33, 9, 0, 12, 0};

        int minVal = a[0];
        int maxVal = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > maxVal) maxVal = a[i];
        }
        for(int i = 1; i < a.length; i++){
            if(a[i] < minVal) minVal = a[i];
        }
        System.out.println("The maximum value is: " + maxVal);
        System.out.println("The minimum value is: " + minVal);
    }
}
