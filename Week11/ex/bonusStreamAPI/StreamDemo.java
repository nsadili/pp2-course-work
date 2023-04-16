package bonusStreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(23, 45, 2, 86, 12, 94, 25));
        Stream<Integer> IntStream = list.stream();

    //    Optional<Integer> st = IntStream.filter(num -> num % 2 == 0).findAny();

    //    System.out.println(
    //    st.get()
    //    );


       Stream<Integer> st = IntStream.filter(num -> num % 2 == 0);
       st.forEach(num -> System.out.print(num + " "));




    }
}
