package pw5;

public class Employee {
    
    private String name;
    private int age,salary;
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "[" + name + " " + "age:" + age + " , salary:"  + salary + "]";
    }
    
}

