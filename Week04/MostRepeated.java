public class MostRepeated {
    public static void main (String[] args) {
        int n=23823332;
        int [] count = new int[10];
        while (n>0)
        {
            count[n%10]++ ;
            n=n/10;
        }
        }
    }