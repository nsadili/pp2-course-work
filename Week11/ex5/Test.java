import java.util.ArrayList;

import Week11.ex5;

public class Test {
    public static void main(String[] args) {
        Employee firangiz= new Employee("Firangiz", 18, 2234);
        
           ArrayList<Employee> employees= new ArrayList<>();
            employees.add(firangiz);
            employees.add("Aytan", 32, 4424);
            employees.add("Chandler", 23, 2555);
            employees.add("Monica", 23, 4423);
            employees.add("Phoebe", 25, 2343);

            employees.sort((e1,e2)->e1.getAge()-e2.getAge());

            System.out.println(employees.toString());

            employees.sort((o1, o2) -> o1.getSalary()-o2.getSalary() );
            System.out.println(employees);


    }
}
