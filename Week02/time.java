import java.util.Scanner;

class time {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int hour = sec / 3600;
        int min = (sec % 3600) / 60;
        int Seconda = sec % 60;
        System.out.printf("%02d:%02d:%02d", hour, min, Seconda);
    }

}
