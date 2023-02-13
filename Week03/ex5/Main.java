public class Main {
    public static void main(String[] args) {
        ComplexNumber img=new ComplexNumber(5, 6);
        System.out.printf("%f %f\n",img.re(),img.imag());
    

        ComplexNumber test=new ComplexNumber(3, 5);
        System.out.printf("%b\n",img.equals(test));

        img.toString();

        test.conjugate();

    }
    
}
