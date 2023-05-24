package Week14;

public class Main {
    Stream.of("one", "two", "bloat")
.limit(1) 
.map(String::toUpperCase) // line x 
.sorted() 
.forEach(System.out::println);
}
