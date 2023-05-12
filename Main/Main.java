package Main;


public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        
        System.out.println("Before method call: " + person1);
        changePerson(person1);
        System.out.println("After method call: " + person1);
    }
    
    public static void changePerson(Person person) {
        person.setName("Bob");
        person.setAge(30);
    }

    
}
