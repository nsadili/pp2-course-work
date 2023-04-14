package Week11.specProperty;
import java.util.Scanner;
public class specMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point(1,2);
        Person person1 = new Person("Unknown", "Character",22);
        SpecificProperty<Integer> oddProperty = num -> num%2 == 0;

        SpecificProperty<Point> isInFirstQ = p -> p.getX() >= 0 && p.getY() >= 0;

        SpecificProperty<String> isPanagram =  str -> {
            boolean[] mark = new boolean[26];

            int idx;

            for(int i = 0; i < str.length(); i++){
                if('A' <= str.charAt(i) && 'Z' >= str.charAt(i)){
                    idx = str.charAt(i) -'A';
                }

                else if('a' <= str.charAt(i) && 'z' >= str.charAt(i)){
                    idx = str.charAt(i) -'a';
                }

                else{
                    continue;
                }
                mark[idx] = true;
            }
            for(int i = 0; i <=25; i++){
                if(mark[i] == false){
                    return false;
                }
            }
            return true;
            
        };

        SpecificProperty<Person> ageChecker = person -> Person.getAge() > 20; 
        

        System.out.println(oddProperty.check(5));

        System.out.println(isInFirstQ.check(p1));

        System.out.println(isPanagram.check(sc.nextLine()));
        System.out.println(ageChecker.check(person1));

        

    }
}
