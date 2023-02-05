public class Time {
    public static void main(String[] args) {
        int sec = Integer.parseInt(args[0]);
        int hrs = sec / 3600;
        int min = (sec % 3600) / 60;
        int sec2 = sec % 60;
        System.out.println(sec + hrs + min + sec2);
    }
}