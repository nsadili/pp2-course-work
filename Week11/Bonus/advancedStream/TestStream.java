import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestStream {
public static void main(String[] args) {
    

    List<Integer> l =  Arrays.asList(1,3,4,5,6,7,8,9,2,4,5,6);
    List<Integer> filteredList = l.stream().filter(n-> n%2==0).collect(Collectors.toList());
    System.out.println("The even numbers are: "+ filteredList);




    List<Person> people= Arrays.asList(

        new Person(18, "Ibrahim", "Ganja"),
        new Person(36, "Arzu", "Baku"),
        new Person(56, "John", "Roma"),
        new Person(20, "Ismayil", "Istanbul")
        

    );
    List<Person> filteredList2= people.stream().filter( p-> p.getAge()>30 && p.getCity()=="Baku").collect(Collectors.toList());

    System.out.println("All the persons whose age is greater than 30 and city is Baku."+ filteredList2);
    

    List<String> words= Arrays.asList("Ibrahim", "Huseynov", "ADA", "Computer science", "Java", "ProgrammingPrinciples2");
    var count= words.stream().mapToInt(String :: length).sum();
    System.out.println("Sum of all string lengths: "+ count);
    System.out.println();




    List<Person> people2= Arrays.asList(

        new Person(18, "Ibrahim", "Ganja"),
        new Person(36, "Arzu", "Baku"),
        new Person(56, "John", "Roma"),
        new Person(20, "Ismayil", "Istanbul")
        

    );

    people2.stream().sorted((x,y)-> x.getAge()-y.getAge()).forEach(System.out :: print);// 20,36,56
    System.out.println();
    people2.stream().sorted((x,y) -> x.getName().compareTo(y.getName())).forEach(System.out :: print); //Arzu, Ibrahim, Ismayil, John
    System.out.println();



    List<Double> listDouble= Arrays.asList(2.3, 4.5, 6.7, 7.8, 100.6);


    double average= listDouble.stream().mapToDouble(Double :: valueOf).average().orElse(Double.NaN); // Double.NaN is a constant in the Double class in Java that represents "not a number".
    System.out.println("Average is: "+ average);

    // Given a list of strings, use the Stream API to filter out all the strings that start with the
  // letter "A" and then convert the remaining strings to uppercase.
    List<String> words2= Arrays.asList("Ibrahim", "Huseynov", "ADA", "Computer science", "Java", "ProgrammingPrinciples2", "Azerbaijan");

    List<String> filteredWords= words2.stream().filter(s -> s.startsWith("A")).map(s->s.toUpperCase()).toList();
    System.out.println("The words which start with A"+ filteredWords);// ADA and Azerbaijan
    System.out.println();

   List <Employee> e= Arrays.asList(
    new Employee("Ibrahim", "CS", 1500.0),
    new Employee("Vaqif", "CE", 1000.0),
    new Employee("Aysel", "BBA", 1200.0),
    new Employee("Sabir", "IT", 1300.0),
    new Employee("Aysun", "HR", 1700.0),
    new Employee("Tofif", "HR", 500.0)
    
   );

   List filteredList3= e.stream().filter(s -> s.getDepartment().equals("HR") && s.getSalary()<1000).collect(Collectors.toList());
   System.out.println("HR and salary is less than 1000 AZN: "+ filteredList3);
   System.out.println();

   List<Integer> l4= Arrays.asList(1,2,3,4,5,6,7,8,6,5,3,5,6,7,7,33,98,34);

   int max= l4.stream().mapToInt(Integer :: intValue).max().orElse(0);
   System.out.println("Maximum value in the list: "+ max);//98



   List<String> findApple= Arrays.asList("apple","orange", "water", "apple", "Ibrahim");

   Optional<String> o= findApple.stream().filter(s-> s.equals("apple")).findFirst();
   System.out.println(o);
   System.out.println();


   List<Person> people3= Arrays.asList(

        new Person(18, "Ibrahim", "Ganja"),
        new Person(36, "Arzu", "Baku"),
        new Person(56, "John", "Roma"),
        new Person(20, "Ismayil", "Istanbul")
        

    );

    Map<String, Person> m= people3.stream().collect(Collectors.toMap(Person :: getName, person-> person));
    
  System.out.println("Person map: "+m);
    




 
   
    
    
}
}
