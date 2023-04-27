import java.util.*;

import java.util.Scanner;

public class Calculator{

    interface calc{
        int operation(int n, int m);
    }
    public static void calc(String[] args) {

        calc max = (int n, int m) -> (n > m) ? n : m;
        calc min = (int n, int m) -> (n < m) ? n : m;

        calc add = (int a, int b) -> a + b;
        calc sub = (int a, int b) -> a - b;
        calc mul = (int a, int b) -> a * b;
        calc div = (int a, int b) -> a / b;

    }
}