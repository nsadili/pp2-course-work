package Bonus;

import java.util.Arrays;
import java.util.Comparator;

public class MoreOnStreamAPI {
    public static void main(String[] args){
        Integer[] numbers = {93, 17, 22, 74, 61, 45, 38, 81, 52, 10};
        //filtering and printing even unmbers
        Arrays.stream(numbers).filter(n -> n%2==0).forEach(str -> System.out.print(str + " "));

        //filtering persons whose age over 30
        Person[] person = {new Person("asd", 44), new Person("rtd", 39), new Person("hfks", 29), new Person("oka", 25), new Person("iuj", 30)};
        Arrays.stream(person).filter(n -> n.getAge()>30).forEach(p -> System.out.println(p.getName()));

        //mapping String based on their length
        String[] words = {"salam", "assalamun", "dear", "friend", "tally", "bally"};
        System.out.println(Arrays.stream(words).mapToInt(word -> word.length()).sum());

        //sorting person array based on their age
        Person[] person2 = {new Person("asd", 44), new Person("rtd", 39), new Person("hfks", 29), new Person("oka", 25), new Person("iuj", 30)};
        Arrays.stream(person2).sorted(new Comparator<Person>() {
            public int compare(Person a, Person b){
                return a.getAge().compareTo(b.getAge());
            }
        }).forEach(a -> System.out.println(a.getName() + " " + a.getAge()));

        //finding average of double array
        double[] doubles = { 1.2, 3.4, 5.6, 7.8, 9.0 };
        System.out.println(Arrays.stream(doubles).sum() / Arrays.stream(doubles).count());

        //Filtering strings which start with A and then to uppercase
        String[] words2 = {"salam", "assalamun", "dear", "friend", "tally", "bally"};
        Arrays.stream(words2).filter(word -> word.startsWith("A") || word.startsWith("a")).forEach(word -> {word.toUpperCase(); System.out.println(word);});
    }
    }


class Person {
    private String name;
    private Integer age;
    
    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }}