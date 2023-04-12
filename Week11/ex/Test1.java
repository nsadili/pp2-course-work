 public interface Test1 { // why without the public keyword I can use Test instead of Test1 ???
    boolean isEven(int n); // a public and abstract method

    Test1 t = (n) -> (n % 2) == 0; // lambda single expression

    public static void main(String[] args) {
        System.out.println(t.isEven(5));
        System.out.println(t.isEven(6));
    }

}
