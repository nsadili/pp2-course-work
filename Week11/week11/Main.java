package Week11.week11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Employees[] e= new Employees[]{
        new Employees("ayshen", 19, 1200),
        new Employees("xanim", 21, 2400),
        new Employees("shahmar", 18, 900)


       };
      Arrays.sort(e, (x,y)-> x.getFirstname().compareTo(y.getFirstname()));
      System.out.println("After sorting by name: "+ Arrays.asList(e));

      Arrays.sort(e, (x,y)-> y.getSalary()-x.getSalary());
      System.out.println("After sorting by salary: "+ Arrays.asList(e));

      Arrays.sort(e, (x,y)-> x.getAge()-y.getAge());
      System.out.println("After sorting by age: "+ Arrays.asList(e));
      



    }
}