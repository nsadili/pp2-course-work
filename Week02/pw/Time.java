public class Time {
    public static void main(String[] args) {

      if (args.length != 1) {
        System.out.println("Usage: java Time <seconds>");
        System.exit(1);
      }

      int seconds = Integer.parseInt(args[0]);
    
      int hours = seconds / 3600;
      int minutes = (seconds % 3600) / 60;
      int remainingSeconds = seconds % 60;

      System.out.println(seconds + " seconds is equivalent to " + hours + " hours, " + minutes + " minutes, and " + remainingSeconds + " seconds.");
    }
  
}
