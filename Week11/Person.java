package Week11;

public class Person {
    private String fullName;
    private int age;
    private Object get;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

public static void main(String[] args) {
    Person h1= new Person("Rahida", 21);
    h1.get.getClass().getFields();
    //change the private atrributes values with reflections not setters
}
}

