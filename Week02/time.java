   import java.util.Scanner ;
   
   public class time {
        public static void main(String[] args)  {
      try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Please enter seconds ");
        int givenSeconds = scanner.nextInt() ;
        int hours = givenSeconds/ 3600 ;
        int minutes = (givenSeconds/3600) %60 ;
        int seconds = givenSeconds % 60 ;
         System.out.println(hours) ;
         System.out.println(minutes);
         System.out.println(seconds);

    }
        }
    }
    