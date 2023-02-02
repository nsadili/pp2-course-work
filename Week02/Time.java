public class Time {
    public static void main(String[] args) {
        int givenSeconds = Integer.parseInt(args[0]);
        int hours = givenSeconds / 3600;
        int minutes = (givenSeconds % 3600) / 60;
        int seconds = givenSeconds % 60;
        
        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
