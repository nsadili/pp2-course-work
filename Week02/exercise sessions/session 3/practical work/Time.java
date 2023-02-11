public class Time {
    public static void main(String[] args) {
        int seconds = Integer.parseInt(args[0]);
        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        seconds -= hours * 3600 + minutes * 60;
        
        System.out.printf("Hours: %d Minutes: %d Seconds: %d", hours, minutes, seconds);
    }
}
