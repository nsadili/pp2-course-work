package pw5;

public class Employee {
    private String firstname;
    private Integer age;
    private Double salary;
    public Employee(String firstname, Integer age, Double salary) {
        this.firstname = firstname;
        this.age = age;
        this.salary = salary;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [firstname=" + firstname + ", age=" + age + ", salary=" + salary + "]";
    }
    

}
