import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReadCSV {
    public static void main(String[] args) {
        
        String filename = "C:\\Users\\TUF DASH\\Documents\\PP2\\pp2-course-work\\Week12\\Week 12 - Incomplete\\person2.csv";
        var person = read(filename);
       System.out.println(person);

      double average =  person.stream().mapToInt((p) -> p.getAge()).reduce(0 , (a,b) -> a+b) / (double) person.size() ;
      System.out.println("Average age:" + average);

      var aboveAverage = person.stream().filter((a) -> a.getAge() > average).collect(Collectors.toList());
      System.out.println(aboveAverage);
      
      var belowAverage = person.stream().filter((a) -> a.getAge() <= average).collect(Collectors.toList());
      System.out.println(belowAverage);

      String above = "aboveAverage.csv";
      String below = "belowAverage.csv";

      writeFile(aboveAverage,above);
      writeFile(belowAverage,below);






      


    }

    static List<Person> read(String filename){
        List<Person> person = new ArrayList<>();
        
        try (FileReader fis = new FileReader(filename);
                BufferedReader read = new BufferedReader(fis);
        ) {
                String line = "";
                Person p = null;
                read.readLine();
                while((line = read.readLine()) != null){
                    String row[] = line.split(",");
                     p= new Person(Integer.valueOf(row[0]), row[1],row[2], Integer.valueOf(row[3]));
                    person.add(p);
                    // for(var el: row){
                    //     System.out.print(el + " ");
                    // }
                    // System.out.println("**");


                }

            
        } catch (Exception e) {
           e.printStackTrace();
        }
        return person;

    }

    static void writeFile(List<Person> person, String filename){

        try (FileWriter fos = new FileWriter(filename);
             BufferedWriter bw = new BufferedWriter(fos);   
        ) {
            bw.write("id,firstname,lastname,age\n");

            person.stream().forEach((a) -> {
                try {
                    bw.write(a.getId() + "," + a.getFirstname() + "," + a.getLastname() + "," + a.getAge() + "\n");
                } catch (IOException e) {
                   
                    e.printStackTrace();
                }
            });


        } catch (IOException e) {
            
            
            e.printStackTrace();
        }




    }
}

class Person{

    String firstname, lastname;
    int age, id;
    public Person(int id,String firstname, String lastname, int age ) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() { 
        return "[" + id + ", " + firstname + ", "+ lastname +", "+ age + "]";
    }
    public int getAge() {
        return age;
    }public String getFirstname() {
        return firstname;
    }public int getId() {
        return id;
    }public String getLastname() {
        return lastname;
    }
    



}
