package Week11.LectureTasks;

interface StringFunction{
        public String func(String str);
}

interface NumFunction{
        public int digits(int n);
}


public class LectureHW{
        public static void main(String[] args) {
             StringFunction sr = s -> new StringBuilder(s).reverse().toString();

             String str = "Salam";
             String res = sr.func(str);

             System.out.println("Original string: "+str);
             System.out.println("Reversed string: "+res);

             System.out.println();

             NumFunction nc = n -> Integer.toString(n).length();

             int digit = 192382;
             int numOfDigits = nc.digits(digit);

             System.out.println("The input integer: "+digit);
             System.out.println("The number of digits: "+numOfDigits);
        }
}

