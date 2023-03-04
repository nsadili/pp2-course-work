import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String in=scan.next();
        System.out.println("Write the word that you want to be sliced");
        char[] arr=in.toCharArray();
        int l=arr.length;
        int cnt=0;
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if(j==cnt) {
                    System.out.printf(" ");
                }
                System.out.printf("%c",arr[j]);
            }
            System.out.println("\n");
            cnt++;
        }
    }
}
