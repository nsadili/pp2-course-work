public class Time {
    public static void main(String[] args) {

        int Number = Integer.parseInt(args[0]);

        int Hours = Number / 3600;
        int Minutes = (Number % 3600) / 60;
        int Seconds = Number % 60;

        System.out.printf("%d hours, %d minutes, %d seconds", Hours, Minutes, Seconds);
    }
}