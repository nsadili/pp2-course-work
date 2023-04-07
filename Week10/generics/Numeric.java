package Week10.generics;

public class Numeric<T extends Number> {
    public T num;

    public Numeric(T num) {
        this.num = num;
    }

    // public static void main(String[] args) {
    // int a=10;
    // // long b=23;

    // double c=-3.5;
    // // float d=2;
    // float e=3.5f;
    // System.out.println(String.format("Reciprocal of number %d: ",
    // a)+reciprocal(a));
    // System.out.println(String.format("Fractional part of number %f: ",
    // c)+fractional(c));
    // System.out.println(String.format("Are %.2f and %.2f absolutely equal?: ", c,
    // e)+equalAbsValue(c,e));

    // }

    public double reciprocal() {
        if (num.doubleValue() == 0)
            throw new IllegalArgumentException("0 cannot be an input");
        double res = (1.0) / num.doubleValue();
        return res;
    }

    public <T extends Number> double fractional() {
        int intPart = 0;
        if (num.doubleValue() < 0) {
            intPart = num.intValue() - 1;
        } else
            intPart = num.intValue();
        // System.out.println(intPart);
        return num.doubleValue() - intPart;
    }

    public <V extends Number> boolean equalAbsValue(V num2) {
        return Math.abs(num.doubleValue()) == Math.abs(num2.doubleValue());
    }

    public <V extends Number> boolean equalAbsValue(Numeric<? extends Number> num2) {
        return Math.abs(num.doubleValue()) == Math.abs(num2.num.doubleValue());
    }
}
