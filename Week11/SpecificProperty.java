package Week11;

public interface SpecificProperty {
    interface IsItOdd{
        int isOdd(int n);
    }

    interface CheckingPoint{
        int isInFirst(int n, int m);
    }

    interface checkingIfPangram{
        String isPangram(String string);
    }

    interface olderThanTwenty{
        String whetherOlder(String firstname, String lastname, int age);
    }
}
