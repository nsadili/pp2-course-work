package Week07;
import java.io.FileNotFoundException;

public class CustomExceptions {

  public static void main(String[] args) {

    try {
      throw new CustomException();
    } catch (RuntimeException e) {
      System.out.println("A Runtime Exception raised!");
    } catch (Exception e) {
      System.out.println("Another type of Exception raised!");
    }

  }

}

class CustomException extends FileNotFoundException {

}