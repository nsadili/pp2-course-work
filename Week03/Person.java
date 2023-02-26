// Practicing Copy Constructor
public class Person {
    private String name;
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    public Person(Person other){
        this.name = other.name;
        this.age = other.age;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "The name is: " + name + ", the age is: " + age;
    }

    public static void main(String[] main){
        Person farid = new Person("Farid", 18);
        Person ramil = new Person(farid);

        System.out.println(farid);
        System.out.println(ramil);
        ramil.name = "ramil";
        System.out.println(farid);
        System.out.println(ramil);
    }
}

