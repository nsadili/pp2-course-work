package PairClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PairClass<Integer, String> pairClass = new PairClass<>(12, "Hello");
        System.out.println(pairClass.getKey());
        System.out.println(pairClass.getValue());

    }
}