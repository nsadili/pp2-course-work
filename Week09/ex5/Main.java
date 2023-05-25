package Week09.ex5;

class ProblemException extends Exception {
    ProblemException(Exception e) { super(e); }

    ProblemException(String message) { super(message); }
}

class MajorProblemException extends ProblemException {
    MajorProblemException(String message) { super(message); }
}

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            System.out.print(1);
            throw new MajorProblemException("Uh oh");
        } catch (ProblemException | RuntimeException e) {
            System.out.print(2);
            try {
                throw new MajorProblemException("yikes");
            } finally {
                System.out.print(3);
            }
        } finally {
            System.out.print(4);
        }
    }
}