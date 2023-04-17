import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee{
    private String firstName;
    private int age;
    private int salary;

    public Employee(String firstName, int age, int salary) {
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return getFirstName()+" | AGE: "+getAge()+" | SALARY: "+getSalary()+"$";
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}

public class MethodReference {
    public static int compareBySalary(Employee a, Employee b) {
        return  a.getSalary() - b.getSalary();
}
    public static int compareByAge(Employee a, Employee b) {
        return a.getAge() - b.getAge();
    }
    public static void main(String[] args) {
    List<Employee> list = Arrays.asList(
        new Employee("Nariman", 19, 2000),
        new Employee("Shamil", 20, 300),
        new Employee("Mahammad", 31, 10)
        );

        list.sort((a, b) -> a.getFirstName().compareTo(b.getFirstName())); //lambda exression
        System.out.println("SORTED 1: "+ Arrays.asList(list));

        // System.out.println(compareBySalary(new Employee("Shamil", 20, 3000), new Employee("Mahammad", 31, 10)));
        list.sort(MethodReference::compareBySalary); //?
        System.out.println("SORTED 2: "+ Arrays.asList(list));

        list.sort(MethodReference::compareByAge);
        System.out.println("SORTED 3: " + Arrays.asList(list));
    }
}
class compareEmployeeAge implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        return b.getAge() - a.getAge();
    }
}
