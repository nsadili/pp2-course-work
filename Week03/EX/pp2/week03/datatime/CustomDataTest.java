package pp2.week03.datatime;


public class CustomDataTest{

    public static void main(String[] args) {

        CustomData copy=new CustomData(22, 2, 1991);
        CustomData copy1=new CustomData(12,1,1992);
        System.out.println(copy.difference(12, 1, 1991));
        System.out.println(copy.compare(copy, copy1));
        copy.displayFormatted();
      


        
    }

}

