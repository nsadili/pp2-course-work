package ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Consumer<String> hello=str -> System.out.println(str);
        Function<List<Integer>,Integer> max= a -> {
            Integer b=-5757457;
            for(int i=0;i<a.size();i++) {
                if(b<a.get(i)) b=a.get(i);
            }

            return b;
        };

        Predicate<Integer> test=a -> a%2!=0;


        hello.accept("Hello");
        List<Integer>list=new ArrayList<Integer>();
        list.add(1);
        list.add(11);
        list.add(9);

        System.out.println(max.apply(list));
        System.out.println(test.test(5));
    }
}
