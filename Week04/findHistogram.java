public class findHistogram {

    public static void histogram(int[] num3) {

        int[] grades = new int[num3.length];
        int[] cnt = new int[num3.length];
        for (int i = 0; i < num3.length; i++) {
            grades[i] = (num3[i] <= 10 && num3[i] >= 0) ? num3[i] : 0;
            cnt[grades[i]]++;
        }
        for (int i = 0; i < cnt.length; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                System.out.print("x" + " ");
            }
            System.out.println();
        }

    }
}
