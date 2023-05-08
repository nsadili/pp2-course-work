package bonus;
import java.util.*;
import java.util.stream.Collectors; 

public class Main {
    public static void main(String[] args) {
    

        List<Integer> l =  Arrays.asList(1,3,4,5,6,7,8,9,2,4,5,6);
        List<Integer> filtered = l.stream().filter(n-> n%2==0).collect(Collectors.toList());
        System.out.println("The even numbers are: "+ filtered);
    
    
    
    
        List<Person> people= Arrays.asList(
    
            new Person(18, "Ulvi", "Baku"),
            new Person(26, "Leman", "Baku"),
            new Person(16, "Nariman", "Lerik"),
            new Person(30, "Klark", "New Zealand")
            
    
        );
        List<Person> filtered2= people.stream().filter( p-> p.getAge()>30 && p.getCity()=="Baku").collect(Collectors.toList());
    
        System.out.println("All the persons whose age is greater than 30 and city is Baku."+ filtered2);
        
    
        List<String> words= Arrays.asList("Ulvi", "Mirzayev", "ADA", "Computer Sc", "Java", "ProgrammingPrinciples-2");
        var count= words.stream().mapToInt(String :: length).sum();
        System.out.println("Sum of all string lengths: "+ count);
        System.out.println();
    
    
    
    
        List<Person> people2= Arrays.asList(
    
        new Person(18, "Ulvi", "Baku"),
        new Person(26, "Leman", "Baku"),
        new Person(16, "Leyla", "Cebrayil"),
        new Person(30, "Klark", "New Zealand")
        );
    
        people2.stream().sorted((x,y)-> x.getAge()-y.getAge()).forEach(System.out :: print);// 20,36,56
        System.out.println();
        people2.stream().sorted((x,y) -> x.getName().compareTo(y.getName())).forEach(System.out :: print); //Arzu, Ibrahim, Ismayil, John
        System.out.println();
    
    
    
        List<Double> listDouble= Arrays.asList(2.3, 4.5, 6.7, 7.8, 100.6);
    
    
        double average= listDouble.stream().mapToDouble(Double :: valueOf).average().orElse(Double.NaN); // Double.NaN is a constant in the Double class in Java that represents "not a number".
        System.out.println("Average is: "+ average);
    
        
        List<String> words2= Arrays.asList("Bakhtiyar", "Guluzada", "ADA", "Computer Eng", "Java", "ProgrammingPrinciples-2", "Azerbaijan");
    
        List<String> filteredWords= words2.stream().filter(s -> s.startsWith("A")).map(s->s.toUpperCase()).toList();
        System.out.println("The words which start with A"+ filteredWords);
        System.out.println();
    
       List <Employee> e= Arrays.asList(
        new Employee("Ulvi", "CE", 3000.0),
        new Employee("Leyla", "CE", 2000.0),
        new Employee("Aygun", "BBA", 1500.0),
        new Employee("Samin", "IT", 1700.0),
        new Employee("Cavidan", "HR", 1600.0),
        new Employee("Rahim", "IT", 1500.0)
        
       );
    
       List filtered3= e.stream().filter(s -> s.getDepartment().equals("HR") && s.getSalary()<1000).collect(Collectors.toList());
       System.out.println("HR and salary is less than 1000 AZN: "+ filtered3);
       System.out.println();
    
       List<Integer> l4= Arrays.asList(1,2,3,4,5,6,7,8,6,5,3,5,6,7,7,33,98,34);
    
       int max= l4.stream().mapToInt(Integer :: intValue).max().orElse(0);
       System.out.println("Maximum value in the list: "+ max);//98
    
    
    
       List<String> findApple= Arrays.asList("apple","orange", "water", "apple", "Bakhtiyar");
    
       Optional<String> o= findApple.stream().filter(s-> s.equals("apple")).findFirst();
       System.out.println(o);
       System.out.println();
    
    
       List<Person> people3= Arrays.asList(
    
       new Person(18, "Bakhtiyar", "Qubadli"),
       new Person(26, "Leman", "Baku"),
       new Person(16, "Leyla", "Cebrayil"),
       new Person(30, "Klaus", "New Orealns")
    
        );
    
        Map<String, Person> m= people3.stream().collect(Collectors.toMap(Person :: getName, person-> person));
        
      System.out.println("Person map: "+m);
    }
    }