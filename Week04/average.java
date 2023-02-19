public class average {
    public static void main (String[]  args){
        int a [] = { 1, 2, 3, 4, 5, 6};
      int sum=0;
      double average;
for (int k = 0; k < a.length; k++){
    sum+=a[k];
}
average = sum*0.1/(a.length);
System.out.println(sum);
System.out.println(a.length);
System.out.printf("The average of array is: " + average);

    }
}
 