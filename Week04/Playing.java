public class Playing {
    public static void main(String[] args){
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        a = b;

        a[2] = 7;

        System.out.println(a[0]);

        for(int i = 0; i <= a.length; i++){
            System.out.println(a[i]++);
        }
    }
}
