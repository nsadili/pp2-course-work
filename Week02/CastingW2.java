public class CastingW2 {
    public static void main(String[] args){
        double d = 5;
        int x = (int)d;
        int y = (int)13.8/8;

        System.out.println(x);
        System.out.println(y);


        long longVal_1 = 25;
        Short shortVal_1 = (short)longVal_1;

        System.out.println(shortVal_1);


        long longVal_2 = 1112223334;
        Short shortVal_2 = (short)longVal_2;

        System.out.println(shortVal_2);


        long longVal_3 = -3434646;
        short shortVal_3 = (short)longVal_3;

        System.out.println(shortVal_3);        
    }
}
