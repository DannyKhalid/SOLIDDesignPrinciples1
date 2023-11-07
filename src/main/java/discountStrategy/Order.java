package discountStrategy;

public class Order {
    private double totalAmount;
    private DiscountStrategy discountStrategy;

    public Order(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public double applyDiscount() {
        if (discountStrategy== null){
            throw new IllegalStateException("Discount Strategy Not Set");
        }
        return discountStrategy.applyDiscount(this);
    }

    public double applyFlatDiscount() {
        // Assume the flat discount is 20% of the total amount
        return this.totalAmount - (this.totalAmount * 0.2);
    }

    public double applySeasonalDiscount() {
        // Assume the seasonal discount is 10% of the total amount
        return this.totalAmount - (this.totalAmount * 0.1);
    }

    // Other methods...
}
