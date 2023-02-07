import java.util.Scanner;

class primality {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int i;

        for (i = 2; i < n; i++)

        {

            if (i % 2 == 0)
                count++;

        }
        if (count == 0) {
            System.out.println("PRIME!");
        } else {
            System.out.println("NOT PRIME!");
        }
    }
}
