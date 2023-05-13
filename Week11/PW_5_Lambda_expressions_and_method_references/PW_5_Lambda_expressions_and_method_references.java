import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PW_5_Lambda_expressions_and_method_references {
    public static void main(String[] args) {

        /*
            a. Lambda expressions can be passed as arguments to methods.
               This allows for more flexible and concise code, especially when
               working with collections and streams in Java.

               For example, consider the following code:
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(number -> System.out.println(number));

        /*
            it's possible to pass other methods (not necessarily Functional Interface implementations)
            as arguments to methods. This is known as method references.
            Method references allow us to refer to an existing method by
            name instead of writing a lambda expression to call it. This can make
            our code more concise and easier to read.

            For example, consider the following code:
         */
        List<String> names = Arrays.asList("Abbas", "Murad", "Cavad", "Ibrahim");
        Collections.sort(names, String::compareToIgnoreCase);

        /*
            c. To sort an array of Employee objects based on different fields, we can use lambda
            expressions and the Comparator interface.

            For example, suppose we have an array of Employee objects:
         */
        Employee[] employees = {
                new Employee("Murad", 25, 50000),
                new Employee("Ibrahim", 30, 60000),
                new Employee("Daris", 35, 70000),
                new Employee("Namiq", 40, 80000)
        };
        //To sort the array by first name, we can use the following code:
        Arrays.sort(employees, (e1, e2) -> e1.getFirstname().compareTo(e2.getFirstname()));
        //To sort the array by age, we can use the following code:
        Arrays.sort(employees, Comparator.comparingInt(Employee::getAge));
        //To sort the array by salary, we can use the following code:
        Arrays.sort(employees, Comparator.comparingInt(Employee::getSalary).reversed());


    }
}
