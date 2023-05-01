package Week11.pw.pw3;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeesLambdaClass {
    public static void main(String[] args) {
        ArrayList<EmployeesLambda> arr = new ArrayList<>();
        Collections.addAll(
            arr,
            new EmployeesLambda("Taghi", 18, 7000),
            new EmployeesLambda("Tom", 56, 735433),
            new EmployeesLambda("Barbara", 34, 83647.836),
            new EmployeesLambda("Antony", 95, 100000000)
        );
       
        arr.sort((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
        System.out.println(arr);
       
        arr.sort((e1, e2) -> e1.getAge() - e2.getAge());
        System.out.println(arr);

        arr.sort((e1, e2) -> e2.getSalary() > e1.getSalary() ? 1 : -1);
        System.out.println(arr);
    }
}
