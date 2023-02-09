public class PoinInCircle {
    public static void main(String[] args) {
        double x, y;
        var n = Integer.parseInt(args[0]);
        while(n>0){
        do{
        x = 2 * Math.random() - 1;
        y = 2 * Math.random() - 1;
        }while(x*x+y*y>1.0);
        System.out.printf("(%f, %f) is in the circle.\n", x, y);
        n--;
    }










    }
}
