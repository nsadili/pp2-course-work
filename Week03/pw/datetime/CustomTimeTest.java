public class CustomTimeTest{
    public static void main(String[] args) {


        CustomTime time1 = new CustomTime(5, 22, 55);
        
        CustomTime time2 = new CustomTime(5);
        
        CustomTime time3 = new CustomTime(5, 56);

        CustomTime time4 = new CustomTime(time1);
        

        System.out.println("Time 1" + time1.toUniversalString());
        System.out.println( "Time 1" +time1.toStandardString());

        System.out.println( "Time 2" +time2.toUniversalString());
        System.out.println("Time 2" + time2.toStandardString());

        System.out.println("Time 3" + time3.toUniversalString());
        System.out.println("Time 3" +time3.toStandardString());

        System.out.println( "Time 4" +time4.toUniversalString());
        System.out.println( "Time 4" + time4.toStandardString());

    }
}



    