
import java.util.Scanner;

public class ex3 {
    interface Calculator {
        double calculate(double a, double b);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Calculator add = (double x, double y) -> x + y;
        Calculator subt = (double x, double y) -> x - y;
        Calculator mult = (double x, double y) -> x * y;
        Calculator div = (double x, double y) -> x / y;
        Calculator exp = (double x, double y) -> Math.pow(x, y);

        String str = scn.nextLine();
        scn.close();
        String els[] = str.split(" ");

        double num = 0;
        double res = Double.parseDouble(els[0]);
        String op = "";

        for (int i = 1; i < els.length; i++) {
            if (i % 2 != 0) op = els[i];

            else {
                num = Double.parseDouble(els[i]);

                if (op.equals("+"))
                    res = add.calculate(res, num);
                if (op.equals("-"))
                    res = subt.calculate(res, num);
                if (op.equals("*"))
                    res = mult.calculate(res, num);
                if (op.equals("/"))
                    res = div.calculate(res, num);
                if (op.equals("^"))
                    res = exp.calculate(res, num);
            }
        }

        System.out.println(res);
    }
}
