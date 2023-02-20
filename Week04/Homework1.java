
    public class Homework1  {

     public static void main (String[] args){ 
        
       int i;
       int a[] = {-45, 3, 7, 112, 4, -5, 27, 33, 9, 0, 12, 0}; 
        int mn=1000;
        int mx=-1000;
        for(i=0; i<a.length; i++ ) {
if(a[i]>mx) mx=a[i];
if(a[i]<mn) mn=a[i];
        }
        System.out.println(mn);
        System.out.println(mx);
    }
}

