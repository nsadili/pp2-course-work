public interface Hw2DigitsFunc {
    int cntNum(int d);

    public static void main(String[] args) {

        Hw2DigitsFunc digit = ((int digit1) -> {
            int cnt = 0;

            while (digit1 % 10 > 0) {
                cnt++;
                digit1 /= 10;
            }
            return cnt;
        });

        System.out.println(digit.cntNum(123434567));
    }
}
