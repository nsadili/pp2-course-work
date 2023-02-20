public class CustomDate {
    private int m;
   private int d;
   private int y;

  public CustomDate() {
    //EMPTY (DEFAULT) CONSTRUCTOR
  }
 public CustomDate(int m, int d, int y){
    this.m = m;
    this.d = d;
    this.y = y;
}
public void setM(int m) {
    this.m = m;
}
public void setD(int d) {
    this.d = d;
}
public void setY(int y) {
    this.y = y;
}
public int getM() {
    return this.m;
}
public int getD() {
    return this.d;
}
public int getY() {
    return this.y;
}

 public void displayDate(){
    System.out.printf("%02d/%02/%d", d,m,y);
  }

}
