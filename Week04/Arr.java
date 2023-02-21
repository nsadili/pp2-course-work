import java.util.Arrays;

public class Arr {
public static void main(String[] args) {
int [] arr =new int[]{1,2,3,4,5,6,7,8,9} ;
{
    for (int i=0 ; i< arr.length; i++)
{
for (int j = 0; j<arr.length; j++)
    if (arr[i]>arr[j]){
    arr[i]= arr[j]+arr[i];
    arr[j]= arr[i] - arr[j];
    arr[i]= arr[j] - arr[i];
    }
}
}
System.out.println(Arrays.toString(arr));
    }

}