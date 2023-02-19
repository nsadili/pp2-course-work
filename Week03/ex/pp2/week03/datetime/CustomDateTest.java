package pp2.week03;

import pp2.week03.datetime.CustomDate;

public class CustomDateTest {
    public static void main(String[] args){
        CustomDate date = new CustomDate(30, 11, 2005);
        date.displayDate();
        date.displayFormatted();
    }
    
}
