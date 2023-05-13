
public class Main 
{
    public static void main(String[] args) 
    {

        Calculator sum = (a, b) -> a + b;
        Calculator subs = (a, b) -> a - b;
        Calculator mult = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;
        Calculator exp = (a, b) -> Math.pow(a, b);

        System.out.println(sum.calculate(4, 6));
        System.out.println(subs.calculate(4, 6));
        System.out.println(mult.calculate(4, 6));
        System.out.println(div.calculate(4, 6));
        System.out.println(exp.calculate(4, 6));

    }
}