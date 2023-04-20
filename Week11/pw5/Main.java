package pw5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Employees[] e= new Employees[]{
        new Employees("Bakhtiyar", 23, 1000),
        new Employees("Ramin", 25, 2000),
        new Employees("Rustam", 19, 3000)


       };
      Arrays.sort(e, (x,y)-> x.getFirstname().compareTo(y.getFirstname()));
      System.out.println("After sorting by name: "+ Arrays.asList(e));

      Arrays.sort(e, (x,y)-> y.getSalary()-x.getSalary());
      System.out.println("After sorting by salary: "+ Arrays.asList(e));

      Arrays.sort(e, (x,y)-> x.getAge()-y.getAge());
      System.out.println("After sorting by age: "+ Arrays.asList(e)); 
      



    }
}
