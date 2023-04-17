package Week11.pw5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Employees[] e= new Employees[]{
        new Employees("Leyla", 19, 1000),
        new Employees("Adila", 21, 2000),
        new Employees("Adil", 40, 4000)


       };
      Arrays.sort(e, (x,y)-> x.getFirstname().compareTo(y.getFirstname()));
      System.out.println("After sorting by name: "+ Arrays.asList(e));

      Arrays.sort(e, (x,y)-> y.getSalary()-x.getSalary());
      System.out.println("After sorting by salary: "+ Arrays.asList(e));

      Arrays.sort(e, (x,y)-> x.getAge()-y.getAge());
      System.out.println("After sorting by age: "+ Arrays.asList(e)); 
      



    }
}