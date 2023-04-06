package Week10;

public class GenericNumeric {
    public static void main(String[] args) {
        int a=10;
        long b=23;
        double c=-3.5;
        float d=2;
        float e=3.5f;
        System.out.println(String.format("Reciprocal of number %d: ", a)+reciprocal(a));
        System.out.println(String.format("Fractional part of number %f: ", c)+fractional(c));
        System.out.println(String.format("Are %.2f and %.2f absolutely equal?: ", c, e)+equalAbsValue(c,e));

    }

    static <T extends Number> double reciprocal(T num){
        if (num.doubleValue()==0) return 0;
        double res = (1.0)/num.doubleValue();
        return res;
    }

    static <T extends Number> double fractional(T num){
        int intPart=0;
        if (num.doubleValue()<0){
            intPart=num.intValue()-1;
        }
        else intPart=num.intValue();
        // System.out.println(intPart);
        return num.doubleValue()-intPart;
    }

    static <T extends Number> boolean equalAbsValue(T num1, T num2){
        return Math.abs(num1.doubleValue())==Math.abs(num2.doubleValue());
    }
}
