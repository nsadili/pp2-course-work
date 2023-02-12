import pp2.week3.datetime.CustomTime;

public class CustomTimeTest{
public static void main(String[] args) {

    CustomTime t=new CustomTime(12,3,45);
    CustomTime t2=new CustomTime(17,36);


    System.out.println(t2.toUniversalString());

    System.out.println(t.toStandartString());

    System.out.println(t.getHour());
    
    System.out.println(t2.getSec());

}

}