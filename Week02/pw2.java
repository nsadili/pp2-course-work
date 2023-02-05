import java.util.Scanner;

class pw2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if ((a % 100) % 4 == 0) {

            System.out.println("Yes,it is leap year!");
        }

        else {
            System.out.println("Not");
        }

    }
}
