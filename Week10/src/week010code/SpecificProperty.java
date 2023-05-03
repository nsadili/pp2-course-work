package week010code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;

public class SpecificProperty {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();

		people.add(new Person("Huseyn", "Sadatkhanov", 33));

		Predicate<Person> isOlderThan20 = person -> person.getAge() > 20;

		Collection<Person> olderThan20 = filter(people, isOlderThan20);

		System.out.println("People older than 20:");
		
		olderThan20.forEach(System.out::println);

	}

	public static <T> Collection<T> filter(Collection<T> c, Predicate<T> p) {

		return c.stream().filter(p).collect(Collectors.toList());
	}
}
