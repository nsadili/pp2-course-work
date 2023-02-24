package Week04.Strings.ex;

public class SortingStrings {
    void sort(char[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    char ch = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = ch;
                }
    }

    String sort(String str) {
        char[] charArr = str.toCharArray();

        sort(charArr);

        return new String(charArr);
    }

    public static void main(String[] args) {
        SortingStrings ss = new SortingStrings();

        System.out.println(ss.sort("name"));
        System.out.println(ss.sort("alphabet"));

    }
}
