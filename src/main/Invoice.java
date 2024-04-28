package main;

public class Invoice {
    private String product_number;
    private String product_description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String product_number, String product_description, int quantity, double pricePerItem) {
        this.product_number = product_number;
        this.product_description = product_description;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }
    public Invoice() {}
    public String getProduct_number() {
        return product_number;
    }
    public String getProduct_description() {
        return product_description;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }
    public void setProduct_number(String product_number) {
        this.product_number = product_number;
    }
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
            throw new RuntimeException("Quantity must be non-negative. Setting to 0.");
        }
    }
    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem >= 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0;
            throw new RuntimeException("Price per item must be non-negative. Setting to 0.");
        }
    }
        public String Amount() {
        if (pricePerItem <= 0 || quantity <= 0) {
            return "0";
        }

        double amount = pricePerItem * quantity;
        return String.format("%.2f", amount);
    }
}
