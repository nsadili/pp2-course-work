package bonusStreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import employee.Employee;

public class StreamDemo {
        public static void main(String[] args) {
                List<Integer> list = new ArrayList<>(Arrays.asList(23, 45, 2, 86, 12, 94,
                                25));
                Stream<Integer> IntStream = list.stream();

                Stream<Integer> st = IntStream.filter(num -> num % 2 == 0);
                st.forEach(num -> System.out.print(num + " "));
                System.out.println();
                List<Person> persons = Arrays.asList(
                                new Person("Laman", 18, "Baku"),
                                new Person("Rasul", 23, "Ankara"),
                                new Person("Kamal", 27, "Paris"),
                                new Person("Shakir", 35, "Baku"));

                Stream<Person> personsStream = persons.stream()
                                .filter(age -> age.getAge() > 30)
                                .filter(city -> city.getCity().equals("Baku"));

                personsStream.forEach(per -> System.out.println(per + " "));

                List<String> nums = new ArrayList<>(Arrays.asList("Laman", "Home", "World", "Hello", "Love", "Life"));

                Stream<String> numsStream = nums.stream();
                Stream<Integer> newStream = numsStream.map(str -> str.length()).collect(Collectors.toList()).stream();

                int sum = 0;

                // TODO;;;;

                List<Person> persons2 = Arrays.asList(
                                new Person("Laman", 18, "Baku"),
                                new Person("Rasul", 23, "Ankara"),
                                new Person("Kamal", 27, "Paris"),
                                new Person("Shakir", 35, "Baku"));

                Stream<Person> perStream2 = persons2.stream();

                // perStream2.sorted(new Comparator<String>() {

                // public int compare(String o1, String o2) {
                // return o2.compareTo(o2);
                // }

                // //TODO ;;;;

                // });

                // List<Double> listofDoubles = Arrays.asList(12.25, 23.25, 5.25, 2.4, 5.7);
                // // 9.77
                // double sum2 = 0.00;
                // double ave;
                // listofDoubles.stream();

                // for (int i = 0; i < listofDoubles.size(); i++)
                // sum2 += listofDoubles.get(i);
                // ave = sum2 / listofDoubles.size();

                // System.out.println(ave);

                // List<Double> listofDoubles = Arrays.asList(12.25, 23.25, 5.25, 2.4, 5.7);

                // Stream<Integer> stInt = listofDoubles.stream().map(x -> Double ::
                // doubleValue());

                List<String> nameList = new ArrayList<String>(Arrays.asList("Laman", "Nazrin", "Kamal",
                                "Kamran", "Panah", "Aykhan", "Alishan"));

                // System.out.println(nameList.stream().anyMatch(name -> name.startsWith("A")));

                // System.out.println(nameList.stream().filter(name ->
                // name.startsWith("A")).reduce(name -> name.startsWith("A")));

                List<Employee> employees = new ArrayList<>(Arrays.asList(
                                new Employee("Laman", "IT", 3500.00),
                                new Employee("Rasul", "HR", 3000.00),
                                new Employee("Someone", "HR", 900.00)));

                Stream<Employee> employeeStream = employees.stream();
                Stream<Employee> newStream2 = employeeStream.filter(salary -> salary.getSalary() < 1000.00)
                                                                        //^^^ is it LE as arguments ???
                                .filter(department -> department.getDepartment().equals("HR"));

                newStream2.forEach(res -> System.out.println(res));

               // employeeStream.reduce(newStream2).map();

               // TODO final salary ???
        }
}
