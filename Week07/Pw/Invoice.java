package Pw;


public class Invoice
{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem)
    throws Exception
    {
        if(pricePerItem < 0)
            throw new IllegalArgumentException(String.format("%f is invalid price", pricePerItem));
        else
           this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;

        if(quantity < 0)
            throw new IllegalArgumentException(String.format("%d is invalid quantity", quantity));
        else
        this.quantity = (quantity > 0) ? quantity : 0;

        this.partNumber = partNumber;
        this.partDescription = partDescription;

    }         

    public String getPartNumber()
    {
        return partNumber;
    }
 
    public void setPartNumber(String partNumber) 
    {
        this.partNumber = partNumber;
    }

    public String getPartDescription()
    {
        return partDescription;
    }

    public void setPartDescription(String partDescription)
    {
        this.partDescription = partDescription;
    }
    
    public int getQuantity()
    {
        if(quantity < 0)
            throw new IllegalArgumentException(String.format("%d is invalid quantity", quantity));
        else
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public double getPricePerItem()
    {
         if(pricePerItem < 0)
            throw new IllegalArgumentException(String.format("%f is invalid price", pricePerItem));
        else
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem)
    {
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
    }

    public double getInvoiceAmount()
    {
        return quantity * pricePerItem;
    }

}

