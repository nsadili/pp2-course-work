package Week11.Ex5;

public class Employee implements Comparable<Employee> {
    private String firstname;
    private int age;
    private int salary;

    public Employee(String firstname, int age, int salary) {
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

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    

    @Override
    public String toString() {
        return "Employee [firstname=" + firstname + ", age=" + age + ", salary=" + salary + "]";
    }

    @Override
    public int compareTo(Employee other) {
        // Sort by firstname
        int result = this.firstname.compareTo(other.firstname);
        if (result != 0) {
            return result;
        }

        // Sort by age
        result = Integer.compare(this.age, other.age);
        if (result != 0) {
            return result;
        }

        // Sort by salary
        return Double.compare(this.salary, other.salary);
    }
}
