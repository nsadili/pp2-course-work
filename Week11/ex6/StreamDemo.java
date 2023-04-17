package Week11.ex6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Color{
    private int r,g,b;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    @Override
    public String toString() {
        return "Color [r=" + r + ", g=" + g + ", b=" + b + "]";
    }
}

public class StreamDemo {
    public static void main(String[] args) {
        String[] names = {"Shamil", "Vusal", "Leyla", "Elvin"};
        Stream<String> nameStream = Arrays.stream(names);

        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,4,5));
        Stream<Integer> numsStream =  set.stream();

        List<Color> colors = Arrays.asList(
            new Color(255,255,255),
            new Color(0,0,0),
            new Color(127,127,127));
        Stream<Color> colorStream = colors.stream();
        System.out.println(nameStream.anyMatch(s -> s.startsWith("V")));
        //System.out.println(numsStream.count());
        Random randomGenerator = new Random();
        Supplier<Integer> rand = () -> randomGenerator.nextInt(10) + 1;
        Stream<Integer> randomStream = Stream.generate(rand).limit(5);
        randomStream.forEach(System.out::println);
        //Optional<Color> res = colorStream.findAny();
        Optional<Color> res = colorStream
            .filter (c -> c. getR() == 0)
            .findFirst();
        System.out.println(res.isPresent() ? res.get() : "Not found");
        res.ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));
        // numsStream
        //     .filter(num -> num % 2 != 0)
        //     .filter(num -> num > 4)
        //     .forEach(System.out::println);
        numsStream
            .filter(num -> num % 2 == 0)
            .map(num -> num + 1)
            .forEach(System.out::println);
        
    }
}
