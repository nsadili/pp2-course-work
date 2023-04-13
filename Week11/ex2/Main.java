package ex2;

public class Main {
    public static void main(String[] args) {
        Odd<Integer>  isOdd;
        isOdd = n -> n%2!=0;

        FirstQuadrant<Point> isFQ = p -> p.getX() > 0 && p.getY() > 0;
        
        Panagram<String> x = str -> {
            str = str.toLowerCase();
            for (char i = 'a';i <= 'z'; i++) {
                if (!str.contains(String.valueOf(i))) {
                    return false;
                }
            }
            return true;
        };


        System.out.println("Panagram: "+x.test("qwerr tyuiop asdfg hjkl zxcv bnm"));
        System.out.println("Panagram: "+x.test("Hello"));
        System.out.println("---------------------");

        Point p1 = new Point(3, 4);
        Point p2 = new Point(-2, 1);
        
        System.out.println("1st quadrant test: " +isFQ.test(p1)); 
        System.out.println("1st quadrant test: " +isFQ.test(p2)); 
        System.out.println("---------------------");

        System.out.println("Odd: "+isOdd.test(5)); 
        System.out.println("Odd: "+isOdd.test(4)); 
        System.out.println("---------------------");

    }
}
