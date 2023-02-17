public class CommandLine{
    public static void main(String[] args){
        print(args);
        System.out.println("Sum: "+ sum(args));
        System.out.println("Average: "+ avrg(args));
    }

    static void print(String[] a){
        for(String x: a){
            System.out.println(x);
        }
    }

    static int sum(String[] a){
        int sum = 0;
        for(String x: a){
            sum += Integer.parseInt(x);
        }
        return sum;
    }

    static int avrg(String[] a){
        int sum = 0;
        for(String x: a){
            sum += Integer.parseInt(x);
        }
        return sum/a.length;
    }
}