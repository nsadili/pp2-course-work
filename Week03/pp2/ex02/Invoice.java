package Week03.pp2.ex02;

public class Invoice {
        private String partNumber;
        private String partDesc;
        private int quantity;
        private double pricePerItem;

        public Invoice(String partNumber, String partDesc, int quantity, double pricePerItem) {
            this.partNumber = partNumber;
            this.partDesc = partDesc;
            this.quantity = (quantity < 0 ? 0 : quantity);
            this.pricePerItem = (pricePerItem < 0 ? 0 : pricePerItem);
        }

        public String getPartNumber() {

            return this.partNumber;
        }

        public String getPartDesc() {

            return this.partDesc;
        }

        public Integer getQuantity() {

            return this.quantity;
        }

        public Double getPricePerItem() {

            return this.pricePerItem;
        }

        public void setQuantity(int quantity) {

            this.quantity = quantity;
        }

        public void setPricePerItem(double pricePerItem) {

            this.pricePerItem = pricePerItem;
        }

        public Double getInvoiceAmount() {

            return this.quantity * this.pricePerItem;
        }
    }

