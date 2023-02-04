import java.util.Scanner;

public class time {
  public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);

      int time = scanner.nextInt();

      int hours = time / 3600;

      int minutes = (time - hours * 3600) / 60;

      int seconds = (time - hours * 3600) - (minutes * 60);

      System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds ");


      scanner.close();
      
  }
}
