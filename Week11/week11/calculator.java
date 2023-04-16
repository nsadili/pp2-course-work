package pp2.week11;

import java.util.Scanner;

public class calculator {
    interface Calculator {
        int operation(int a, int b);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Calculator add = (int x, int y) -> x + y;
        Calculator sub = (int x, int y) -> x - y;
        Calculator mul = (int x, int y) -> x * y;
        Calculator div = (int x, int y) -> x / y;

        String str = scn.nextLine();
        System.out.println(str);
        String elements[] = str.split("");
        for (String str2 : elements) {
            System.out.println(str2 + "\n");
        }
        int num1 = 0, num2 = 0, sum = 0;
        String operation = " ";
        for (int i = 0; i < elements.length; i++)
        {
            if (i % 2 != 0)
                num1 = Integer.parseInt(elements[i]);
            if (i % 2 == 0) {
                operation = elements[i];
                num2 = Integer.parseInt(elements[i + 1]);
                i++;
            }
            if (operation.equals("+")) {
                sum = add.operation(sum, num2);
            }
            if (operation.equals("-")) {
                sum = sub.operation(sum, num2);
            }
            if (operation.equals("+")) {
                sum = mul.operation(sum, num2);
            }
            if (operation.equals("+")) {
                sum = div.operation(sum, num2);
            }
        }
    }
}
