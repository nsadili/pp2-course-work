package specproperties;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,9,11);
        List<String> words= Arrays.asList("racecar", "Pack my box with five dozen liquor jugs",
        "AL","aa","The quick brown fox jumps over the lazy dog");
        List<Account> accounts= Arrays.asList(new Account("null", "wds", 20.0),new Account("null", "wds", 2.0),new Account("null", "wds", 0.0));


       SpecificProperty<Integer> oddInteger = n -> n%2!=0;
       System.out.println(  Utility.count(number, oddInteger));

       System.out.println(Utility.filter(number,oddInteger));

       List<point> point= Arrays.asList(new point(2, 3), new point(0,-52), new point(10,20), new point(-9, -4));

       SpecificProperty<point> firstPoint = p -> p.getX() > 0 && p.getY() > 0;

       System.out.println(Utility.filter(point, firstPoint));

       List<Person> person = Arrays.asList(new Person("Shamil", "Abbasov",29), new Person("Rufet", "Hajizade", 30),
         new Person("NBariman", "Mammadov",20));

       SpecificProperty<Person> olderPerson = p -> p.getAge() >20;

       System.out.println(Utility.count(person,olderPerson));
       System.out.println(Utility.filter(person,olderPerson));

       SpecificProperty<String> panagram = s-> {

        s=s.toLowerCase();
        var arr=s.toCharArray();
        int[] matrix = new int[26];
        for(var i=0;i<matrix.length;i++){
                matrix[i] = 0;
        }

        for(var i=0;i<arr.length;i++){
                var index= arr[i] - 97;
                if(index <0 || index > 26) continue;
                if(matrix[index]==0) matrix[index] =1;


        }

        for(var i=0;i<matrix.length;i++){
          if(matrix[i]==0) return false;
    }
    return true;



       };

       System.out.println(Utility.count(words,panagram));
       System.out.println(Utility.filter(words,panagram));
       System.out.println(words.stream().filter(panagram)).collect(Collectors.toList());



        

    }
}
