package specproperties;

public class CheckPolindrom implements SpecificElement<String> {

  @Override
  public boolean check(String obj) {
    return new StringBuilder(obj).reverse().toString().equals(obj);
  }

}
