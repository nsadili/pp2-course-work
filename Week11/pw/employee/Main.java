package employee;
import java.util.ArrayList;
// import java.util.Comparator;

public interface Main {
    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<>();
        arr.add(new Employee("Laman", 18, 5000.00));
        arr.add(new Employee("Nazrin", 25, 4500.00));
        arr.add(new Employee("Rasul", 35, 3500.00));
        arr.add(new Employee("Samir", 30, 4000.00));
        arr.add(new Employee("Ilham", 45, 2500.00));

        // arr.sort(new Comparator<Employee>() {
        //     @Override
        //     public int compare(Employee o1, Employee o2) {
        //         return o1.getAge() - o2.getAge();
        //     }
        // });

        arr.sort((o1, o2) -> o1.getAge() - o2.getAge());

        System.out.println(arr.toString());

        System.out.println();

        arr.sort((a1, a2) -> a1.getFirstName().compareTo(a2.getFirstName()));

        System.out.println(arr);

        arr.sort((a1, a2) -> (int) (a1.getSalary() - a2.getSalary()));
        System.out.println(arr);

        //  arr.sort(new Comparator<Employee>() {
        //     @Override
        //     public int compare(Employee o1, Employee o2) {
        //         return (int) (o1.getSalary() - o2.getSalary());
        //     }
        // });

    }
}