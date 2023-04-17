public class Employee {
    private String firstName;
    private Integer age;
    private Double salary;

    public String getFirstName() {
        return firstName;
    }

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Employee setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Double getSalary() {
        return salary;
    }

    public Employee setSalary(Double salary) {
        this.salary = salary;
        return this;
    }

    public Employee(String firstName, Integer age, Double salary) {
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }
}
