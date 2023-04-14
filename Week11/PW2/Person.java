package PW2;

public class Person implements Cloneable {
    private String personName;
    private int age;
    
    public Person (String personName, int age) {
        setAge(age);
        setPersonName(personName);
    }
    public String getPersonName() {
        return personName;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
