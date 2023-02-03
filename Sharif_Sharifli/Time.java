import java.util.Scanner;

class Time {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number of seconds: ");
    int totalSeconds = scanner.nextInt();
    int hours = totalSeconds / 3600;
    int minutes = (totalSeconds % 3600) / 60;
    int seconds = totalSeconds % 60;
    System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
  }
}