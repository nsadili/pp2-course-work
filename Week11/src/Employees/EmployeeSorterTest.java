package Employees;
import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSorterTest {
  
  public static void main(String[] args) {
    EmployeeFeatures[] employees = { 
      new EmployeeFeatures("John", 25, 50000),
      new EmployeeFeatures("Alice", 30, 60000),
      new EmployeeFeatures("Bob", 20, 40000),
      new EmployeeFeatures("Charlie", 35, 70000)
    };
    
    Arrays.sort(employees, Comparator.comparing(EmployeeFeatures::getFirstName));
    System.out.println(Arrays.toString(employees));// Sorted by First Name
    
    Arrays.sort(employees, Comparator.comparingInt(EmployeeFeatures::getAge));
    System.out.println(Arrays.toString(employees));//Sorted by Age 
    
    Arrays.sort(employees, Comparator.comparingInt(EmployeeFeatures::getSalary));
    System.out.println(Arrays.toString(employees)); //Sorted by Salary
  }
  
}

