package Week11;


public class Employees {
    private String firstname;
    private int age;
    private int salary;
    

    public Employees(String firstname, int age, int salary) {
        this.firstname = firstname;
        this.age = age;
        this.salary = salary;
    }
    public String getFirstname() {
        return firstname;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employees [firstname=" + firstname + ", age=" + age + ", salary=" + salary + "]";
    }
    
    
}