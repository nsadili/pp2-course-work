package Week11;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) 
    {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() 
    {
        return fullName;
    }

    @Override
    public String toString() 
    {
        return "Person{" +
                "FullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() 
    {
        return age;
    }
}