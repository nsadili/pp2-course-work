package practicalwork;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {
	
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
	}

	Person[] persons = { new Person("Huseyn", 30), new Person("Zakir", 25), new Person("Ali", 35), };

	public static void savePersonsToFile(Person[] persons, String fileName) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			for (Person person : persons) {
				oos.writeObject(person);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readPersonsFromFile(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			while (true) {
				try {
					Person person = (Person) ois.readObject();
					System.out.println(person);
				} catch (EOFException e) {
					break; // EOF indicator, break the loop when end of file is reached
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
