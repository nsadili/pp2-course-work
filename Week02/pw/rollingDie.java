public class rollingDie {
    public static void main(String[] args){
        //1,2,3,4,5,5,6,6 n is 8
        int a = (int)(Math.ceil(Math.random() * 8));
        switch(a){
            case 1:
            System.out.printf("Dice rolled, the value is:1");
            break;
            case 2:
            System.out.printf("Dice rolled, the value is:2");
            break;
            case 3:
            System.out.printf("Dice rolled, the value is:3");
            break;
            case 4:
            System.out.printf("Dice rolled, the value is:4");
            break;
            case 5:
            System.out.printf("Dice rolled, the value is:5");
            break;
            case 6:
            System.out.printf("Dice rolled, the value is:5");
            break;
            case 7:
            System.out.printf("Dice rolled, the value is:6");
            break;
            case 8:
            System.out.printf("Dice rolled, the value is:6");
            break;
        }
    }
}
