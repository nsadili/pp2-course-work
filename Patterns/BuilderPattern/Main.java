package Patterns.BuilderPattern;

import Patterns.SingletonPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(30)
                .setAddress("123 Main St.")
                .build();

        System.out.println(person.getFirstName());

        
        System.out.println(Singleton.getInstance().getClass());

        
    }
}
