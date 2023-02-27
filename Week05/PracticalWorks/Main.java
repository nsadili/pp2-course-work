package Week05.PracticalWorks;

public class Main {
    public static void main(String[] args) {

            Person person1=new Person("Ali","Shukurov","Male");
            Person person2=new Person("Alisadiq","Shukurov","Male");
            System.out.println(person1.equals(person2));//false
            System.out.println(person1.toString());//Person/firstName='Ali', lastName='Shukurov', gender='Male'
        }
    }

