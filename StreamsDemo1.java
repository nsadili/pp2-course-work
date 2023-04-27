import java.util.stream.Stream;
public class StreamsDemo1 {

    public static void main(String[]args){

        String[] names = { "Shamil", "Vusal", "Leyla", "Elvin", "Vugar"};
         Stream <String>  namesStream = Arrays.stream(names);
          Set<Integer> set = new HashSet(Arrays.asList(....a:1, 4, 5, 6, 8, 4, 2));
          Stream<Integer> numsStream = set.stream();
          List<Color> colors = Arrays.asList(
            new Color(r:255, g:255, b:255);
            new Color(r:0, g:0, b:0);
            new Color(r:127, g:127, b:127);
            new Color(r:0, g:0, b:225);

Stream<Color> colorStream = colors.stream());

//Map<String, Integer> wordCounts = new HashMap<>();
//add some elements

         //System.out.println(namesStream.anyMatch(s -> s.startsWith(prefix: "V")));
          //System.out.println(numsStream.count()));

          Random randomGenerator = new Random();
          Supplier<Integer> rand = () -> randomGenerator.nextInt(bound:10) + 1;
          Stream<Integer> randomStream = Stream.generate(rand).limit(5);

//random.Stream.forEach(num -> System.out.println(num));
//randomStream.forEach(System.out::println);

Optional<Color> res = colorStream
.filter(c-> c.getR() ==0)
.findFirst()

//if (res.isPresent())
//System.out.println(res.get));
//else
//System.out.println("Not found anything");

//System.out.println(
   // res.isPresent()
    //? res.get()
   // : "Not found anything");

 //res.ifPresent(System.out::println);
 //res.ifPresentorElse(
   // System.out::println,
    //()->System.out.println(x: " Not found anything"));

    numsStream
 .filter(num -> num % 2 !=0)
  .filter(num -> num > 4)
  .forEach(System.out::println);


numsStream.filter(num-> num % 2 == 0)
.map(num -> num + 1)
.forEach(System.out::println);



            }
}