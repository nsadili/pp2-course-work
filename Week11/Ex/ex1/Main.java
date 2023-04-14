package Ex.ex1;

import javax.swing.event.SwingPropertyChangeSupport;

public class Main {

    public static void main(String[] args) {

        AFuncInt func = new AFuncInt() {

            @Override

            public void apply(String str) {

                System.out.println("Anonymous > " + str);

            }

            @Override

            public void print(String str1, String str2) {

                System.out.println("Overriden > " + str1 + " " + str2);

            }

        };

        // func.apply("Program");

        // AFuncInt.print("Program");

        AFuncInt lambda = s -> System.out.println("LAmbda > " + s);

        

    }
}
