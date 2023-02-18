import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please insert the length of array: ");
        int length=scan.nextInt();
        System.out.println("Please insert the array: ");
        char arr[]=new char[length];
        String in = scan.next();
        for(int i=0;i<length;i++) {
            arr[i] = in.charAt(i);
        }
        int i=length-1;
        int j=0;
        char temp;

        while(j<i){
            temp= arr[i];
            arr[i--]=arr[j];
            arr[j++]=temp;
        }
        System.out.println(arr);
    }
}
