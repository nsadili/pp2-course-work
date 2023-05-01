package SharedObjects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of threads");
        int N = sc.nextInt();
        Counter counter = new Counter();

        Incrementor incrementor = new Incrementor(counter, N);
        Reader reader = new Reader(counter, N);

        incrementor.start();
        reader.start();

        try {
            incrementor.join();
            reader.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception caught");
        }
    }
}