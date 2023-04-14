package Stream;

public class Person {
    private int age;
    private String name, city;
    public Person(int age, String name, String city) {
        this.age = age;
        this.name = name;
        this.city = city;
    }
    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return name + " age:" + age + " city:" + city +" ";
    }
    public String getName() {
        return name;
    }
    
}
