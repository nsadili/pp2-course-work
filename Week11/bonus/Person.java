package bonus;

public class Person{
    private int age;
    private String name;
    private String city;
    
    
    public Person(int age, String name, String city) {
        this.age = age;
        this.name = name;
        this.city = city;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + ", city=" + city + "]";
    }
    

}