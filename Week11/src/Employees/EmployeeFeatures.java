package Employees;

public class EmployeeFeatures {
    private String firstName;
    private int age;
    private int salary;
    
    public EmployeeFeatures(String firstName, int age, int salary) {
      this.firstName = firstName;
      this.age = age;
      this.salary = salary;
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
    
    public String toString() {
      return firstName + " (" + age + ") $" + salary;
    }
  }
  