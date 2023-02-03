public class Average {
    public static void main(String[] args) {
        var sum = 0;
        var count = 0;
        var average = 0;
        var i = 0;
        while (i < args.length) {
            sum = sum + Integer.parseInt(args[i]);
            count++;
            i++;
        }
        average = sum / count;
        System.out.println("Average of " + args.length + " numbers is " + average);
        
    }
}