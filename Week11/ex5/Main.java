package ex5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<>();
        arr.add(new Employee("Vasila", 18, 6000.90));
        arr.add(new Employee("Laman", 18, 5998.10));
        arr.add(new Employee("Ilaha", 19, 6000.80));
        arr.add(new Employee("Rahima", 17, 5555.55));

        arr.sort((str1, str2) -> str1.getFirstName().compareTo(str2.getFirstName()));
        System.out.println("Sorted array by first names:\n" + arr);

        System.out.println();

        arr.sort((age1, age2) -> age1.getAge() - age2.getAge());
        System.out.println("Sorted array by ages:\n" + arr);

        System.out.println();

        arr.sort((sal1, sal2) -> Double.compare(sal1.getSalary(), sal2.getSalary()));
        System.out.println("Sorted array by salary:\n" + arr);


    }
}
