package Week11.Ex5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rufat", 18, 2500);
        Employee e2 = new Employee("Nariman", 15, 1400);
        Employee e3 = new Employee("Shamil", 19, 2100);
        Employee e4 = new Employee("Mahammad", 35, 1600);

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4);
        
        // employees.sort((em1, em2)->em1.getFirstname().compareTo(em2.getFirstname()));
        
        EmployeeSort sortByFirstname = arr->{
            arr.sort((em1, em2) -> em1.getFirstname().compareTo(em2.getFirstname()));
        };
        
        EmployeeSort sortByAge = arr->{
            arr.sort((em1, em2) -> Integer.compare(em1.getAge(), em2.getAge()));
        };
        
        EmployeeSort sortBySalary = arr->{
            arr.sort((em1, em2) -> Integer.compare(em1.getSalary(), em2.getSalary()));
        };
        
        
        sortByFirstname.sort(employees);
        for (Employee emp : employees){
            System.out.println(emp);
        }

        sortByAge.sort(employees);
        for (Employee emp : employees){
            System.out.println(emp);
        }

        sortBySalary.sort(employees);
        for (Employee emp : employees){
            System.out.println(emp);
        }

        
    }

}
