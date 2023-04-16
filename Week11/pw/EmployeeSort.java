import java.util.Arrays;

public class EmployeeSort {
    public static void main(String[] args) {
        Employee[] employees = { new Employee( "Roya", "Alizada", 19, 5000),
    new Employee("Zeynep", "Aliyeva", 18, 4700)
};

// sorted by first name
Arrays.sort(employees, (e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
printEmployee(employees);

// sorted by last name
Arrays.sort(employees, (e1, e2) -> {
    String lastName1 = e1.getLastName();
    String lastName2 = e2.getLastName();
    if (lastName1 == null && lastName2 == null) 
        return 0;
     else 
        return lastName1.compareTo(lastName2);
    
});
printEmployee(employees);

//sorted by age
Arrays.sort(employees, (e1, e2) -> e1.getAge() - e2.getAge());
for(Employee employee : employees)
printEmployee(employees);
 
//sorted by salary
Arrays.sort(employees, (e1, e2) -> {
    return Double.compare(e1.getSalary(), e2.getSalary());
});
printEmployee(employees);
    }
private static void printEmployee(Employee[] employees){
    for(Employee e: employees)
    System.out.println(e);
    System.out.println();
}

}

