import java.util.function.Consumer:

public class FunctionsDemo{
public static void main(String[]args){

    Consumer<String> c1 = str -> System.out.println(str);
    Consumer<String> c2 = str -> System.out.println(str.toUpperCse());
 
    c1.accept(t:"Hello");
    c2.accept(t:"Hello");

    Function<String, String> toUpper = str -> str.toUpperCse();
    Function<String, Integer> toLemgth = str -> str.length();
//System.out.println(toUpper.apply("my name is ...."));


System.out.println(toLength.apply(t: "Programming principles 2"));
System.out.println(toLength.apply(t: "null"));
Predicate<Integer> isOdd = n -> n % 2 !=0;
//System.out.println(isOdd.test(t:5));
//System.out.println(isOdd.test(t:10));

Predicate<String> isAnagram = str -> str = !=null &&
new StringBuilder(str)
.reverse().toString() == str;

//System.out.println(isAnagram.test(t:"abcba"));

Random randomGenerator = new Random();

//1-10
Supplier<Integer> rand = () -> randomGenerator.nextInt(bound:10) + 1;

double avg = 0;

for (int i=0; i < 1000; i++)
avg += rand.get();

avg = avg / 1000;

System.out.println(avg);

randomGenerator = new Random();
}

}
