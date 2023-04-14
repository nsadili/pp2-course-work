import generics.Numeric;

public class Main{
    public static void main(String[]args){
       
       
 Numeric<Integer> num = new Integer<>(value:0f);
Numeric<Float> num = new Numeric<>(value:0f);

System.out.println(num.getValue);

//System.out.println(num.reciprocal());
System.out.println(num.fractional());

System.out.println(num.compareAbs(another:2.5));
//num.compareAbs(num2);


num.compareAbs(another:2.5);
num.compareAbs(num2.getValue().doubleValue());


}
}
