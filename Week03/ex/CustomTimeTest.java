import pp2.week03.datetime.CustomTime;
public class CustomTimeTest {
    public static void main(String[] args) {
     CustomTime t1= new CustomTime(10,45,30);
     System.out.println("The universal version of time: " + t1.toUniversalString());
     System.out.println("The standart version of time: "+ t1.toStandartString());

     CustomTime t2= new CustomTime();
     System.out.println("The universal version of time: " +t2.toUniversalString());
     System.out.println("The standart version of time: "+ t2.toStandartString());


     CustomTime t3= new CustomTime(9);
     System.out.println("The universal version of time: " +t3.toUniversalString());
     System.out.println("The standart version of time: "+ t3.toStandartString());


     CustomTime t4= new CustomTime(3 ,15);
     System.out.println("The universal version of time: " +t4.toUniversalString());
     System.out.println("The standart version of time: "+ t4.toStandartString());

     CustomTime t5 = new CustomTime(t2);
     System.out.println("The universal version of time: " +t5.toUniversalString());
     System.out.println("The standart version of time: "+ t5.toStandartString());








    }
}
