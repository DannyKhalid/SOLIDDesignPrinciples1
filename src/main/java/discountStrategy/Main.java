package discountStrategy;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(100);
        order.setDiscountStrategy(new FlatDiscount());
        System.out.println("Total with Flat discount is "+order.applyDiscount());

        order.setDiscountStrategy(new FestiveDiscount());
        System.out.println("Total with Festive discount is "+order.applyDiscount());


}}
