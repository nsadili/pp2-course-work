package Week03;

public class Invoice{
    private int Quantity;
    private int Price;
    private Object String;
    private Object Integer;


    public void main(String[] args) {
        String PartNumber;
        String PartDescript;
        Integer Quantity;
        Integer Price;

        Invoice(String PartNumber, String PartDescript, Integer Quantity, Integer Price){

            if (Quantity <= 0){
                this.Quantity = 0;
            }

            if (Price <= 0){
                this.Price = 0;
            }
        }

        public double getInvoiceAmount(){
            return this.Quantity * this.Price;
        }

        public String getPartNumber(){
            return PartNumber;
        }

        public void setPartNumber(String PartNumber){
            this.PartNumber = PartNumber;
        }

        public String getPartDescript(){
            return PartDescript;
        }

        public void setPartDescript(String PartDescript){
            this.PartDescript = PartDescript;
        }

        public String getQuantity(){
            return PartQuantity;
        }

        public void setPartQuantity(String PartQuantity){
            this.PartQuantity = PartQuantity;
        }

        public double getPrice(){
            this.Price = Price;
        }

    }

    private void Main() {
    }

    private void Invoice(Object string2, Object string3, Object integer2, java.lang.Integer price2) {
    }
}
