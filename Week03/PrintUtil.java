public class PrintUtil{

    public void print(){
        System.out.println("Default print!");
    }
    public void print(int value){
        System.out.println("Integer argument: " +value);
    }
    public void print(float value){
        System.out.println("Float argument: " +value); 
    }
    public void print(int val1, float val2){
        System.out.println("Int arg: " +val1+ ", Float arg: " +val2); 
    }

    public static void main(String[] args){
        PrintUtil answer = new PrintUtil();

        answer.print();
        answer.print(7);
        answer.print(5.78f);
        answer.print(7, 5.78f);

    }

}