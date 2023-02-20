public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }
}

public class EmployeeDatabase {
    private List<Employee> employees;

    public EmployeeDatabase() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Employee> getEmployeesBySalary(double minSalary, double maxSalary) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            double salary = employee.getSalary();
            if (salary >= minSalary && salary <= maxSalary) {
                result.add(employee);
            }
        }
        return result;
    }

    public void increaseSalaryByPercent(double percent) {
        for (Employee employee : employees) {
            double currentSalary = employee.getSalary();
            double newSalary = currentSalary * (1 + percent / 100);
            employee.setSalary(newSalary);
        }
    }

    public Employee getEmployeeWithHighestSalary() {
        Employee highestPaid = null;
        for (Employee employee : employees) {
            if (highestPaid == null || employee.getSalary() > highestPaid.getSalary()) {
                highestPaid = employee;
            }
        }
        return highestPaid;
    }
}




