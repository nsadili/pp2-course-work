class Employee {
    private String firstname;
    private int age;
    private double salary;

    public Employee(String firstname, int age, double salary) {
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

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + " firstname ='" + firstname + '\'' + ", age = " + age + ", salary = " + salary + '}';
    }
}