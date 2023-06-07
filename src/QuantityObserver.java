public class QuantityObserver implements OrderObserver {

    public void update(Order order) {
        if(order.getQuantity() >= 5) {
            order.setPrice(order.getPrice() - order.getShippingCost());
            System.out.println("You have 5 or more products, shipping is free!");
        }
    }

}