package Ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        Person person = new Person(name, age);

        System.out.println("Name: " + person.getFirstName());
        System.out.println("Age: " + person.getAge());

        scanner.close();
    }
}
