import java.util.*;

import java.util.Scanner;

public class Calculator{

    interface calculator{
        int operation(int a, int b);
    }
    public static void calculator(String[] args) {

        calculator max = (int a, int b) -> (a > b) ? a : b;
        calculator min = (int a, int b) -> (a < b) ? a : b;

        calculator add = (int x, int y) -> x + y;
        calculator sub = (int x, int y) -> x - y;
        calculator mul = (int x, int y) -> x * y;
        calculator div = (int x, int y) -> x / y;

    }
}