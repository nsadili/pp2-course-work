public class HW1{
    public static void main(String[] args) {
        
        int[] a = { -45, 3, 7, 112, 4, -5, 27, 33, 9, 0, 12, 0};
        int mn = a[0];
        int mx = a[0];
        int i;

        for( i=0; i< a.length; i++){
            if(a[i]<= mn) mn = a[i];
            if(a[i]>= mx) mx = a[i];
        }
        System.out.println(mn+ ","+ mx);
    }
}