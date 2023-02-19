import java.util.Scanner;

public class Slices {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the word : ");
        String w= sc.nextLine();
        slice(w);
    }

    public static void slice(String w){
        for(int i = 1; i < w.length(); i++){
            System.out.println(w.substring(0,i)+ " " + w.substring(i, w.length()));
        }

    }
}
