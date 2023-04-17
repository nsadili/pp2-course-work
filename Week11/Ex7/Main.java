package Week11.Ex7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 17, 23, 12, 8, 78, 3, 9, 36));  
        Stream<Integer> numsStream = nums.stream();
        // numsStream.filter(n->n%2==0).forEach(System.out::println);

        Person p1 = new Person("Rufat", 18, "Baku");
        Person p2 = new Person("Shamil", 40, "Gabala");
        Person p3 = new Person("Arzum", 32, "Baku");
        Person p4 = new Person("Nariman", 25, "Neftcala");
        List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3, p4)); 
        Stream<Person> persomStream = persons.stream();
        persomStream.filter(p->p.getAge()>30).filter(p->(p.getCity()=="Baku")).forEach(System.out::println);



    }
    
    
}
