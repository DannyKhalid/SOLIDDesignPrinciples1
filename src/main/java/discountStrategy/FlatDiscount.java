package discountStrategy;

public class FlatDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(Order order) {
        return order.getTotalAmount()- (order.getTotalAmount() * 0.1);
    }
}
