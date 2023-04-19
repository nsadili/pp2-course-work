package Week11;

import java.util.Arrays;

public class Employee {
    private String firstname;
    private Integer age;
    private Integer salary;

    public Employee(String firstname, int age, int salary) {
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
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int compareByName(Employee a, Employee b) {
        return a.firstname.compareTo(b.firstname);
    }

    public static int compareByAge(Employee a, Employee b) {
        return a.age.compareTo(b.age);
    }

    public static int compareBySalary(Employee a, Employee b) {
        return a.salary.compareTo(b.salary);
    }

    @Override
    public String toString() {
        return "firstname: " + firstname + " age: " + age + " salary: " + salary; 
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Alex", 35, 2000);
        Employee e2 = new Employee("Michael", 50, 5000);
        Employee e3 = new Employee("Colin", 45, 3000);
        Employee e4 = new Employee("Simon", 40, 4000);
        Employee e5 = new Employee("Robert", 30, 1000);

        Employee[] arr = new Employee[5];
        arr[0] = e1;
        arr[1] = e2;
        arr[2] = e3;
        arr[3] = e4;
        arr[4] = e5;

        for(Employee e: arr){
            System.out.println(e.toString());
        }

        System.out.println();

        //Arrays.sort(arr, (a, b) -> Employee.comparByAge(a, b));
        Arrays.sort(arr, Employee :: compareByAge);
        Arrays.sort(arr, Employee :: compareByName);
        Arrays.sort(arr, Employee :: compareBySalary);

        for(Employee e: arr){
            System.out.println(e.toString());
        }
    }
}
