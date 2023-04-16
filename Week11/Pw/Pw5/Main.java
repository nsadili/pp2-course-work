package Pw5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Employees[] e= new Employees[]{
        new Employees("Ibrahim", 19, 1200),
        new Employees("Zaur", 21, 2400),
        new Employees("Aysun", 18, 900)


       };
      Arrays.sort(e, (x,y)-> x.getFirstname().compareTo(y.getFirstname()));
      System.out.println("After sorting by name: "+ Arrays.asList(e));// Aysun Ibrahim Zaur

      Arrays.sort(e, (x,y)-> y.getSalary()-x.getSalary());
      System.out.println("After sorting by salary: "+ Arrays.asList(e));// 2400 1200 900

      Arrays.sort(e, (x,y)-> x.getAge()-y.getAge());
      System.out.println("After sorting by age: "+ Arrays.asList(e)); // 18 19 21
      



    }
}
