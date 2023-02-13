import pp2.week3.datetime.CustomDate;

public class CustomDate{

    public static void main(String []args){
               
        CustomDate d=new CustomDate(29, 5,2004);
         
         CustomDate d1= new CustomDate(8,5,2004);

    
             System.out.println(d.getDay() +" ," + d.get.Month() + ","+ d.getYear());

                   
                 d.displayDate();
                 d1.displayDate();

                         d.displayFormatted();
                         d1.displayFormatted();
                    
                    System.out.println(d.compare(d,d1));

                       d.setDay(5);
                     System.out.println(d.getDay));

     }


}
