public class Invoice {
   private String pn;
   private String pd;
   private int q;
   private double pr;

  public Invoice(){
    //EMPTY (DEFAULT) CONSTRUCTOR
  }
  public Invoice(String pn, String pd, int q, double pr){
    this.pn = pn;
    this.pd = pd;
    this.q = q;
    this.pr = pr;
    if (q < 0) this.q = 0;
  else this.q = q;
  if (pr < 0) this.pr = 0.0;
else this.pr = pr;
  }
  public void setPn(String pn) {
    this.pn = pn;
}
public void setPd(String pd) {
    this.pd = pd;
}
public void setQ(int q) {
    this.q = q;
  if (q < 0) this.q = 0;
  else this.q = q;

}
public void setPr(double pr) {
    this.pr = pr;
if (pr < 0) this.pr = 0.0;
else this.pr = pr;
}

   public String getPn() {
    return this.pn;
}
   public String getPd() {
    return this.pd;
}
   public int getQ() {
    return this.q;
   
}
   public double getPr() {
    return this.pr;
}



  public double getInvoiceAmount(){
   var amount = this.q * this.pr;
   return amount;

  }
  
  

  

  
  
  


}