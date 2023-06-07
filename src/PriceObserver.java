public class PriceObserver implements OrderObserver {

    public void update(Order order) {
        if(order.getPrice() >= 200) {
            order.setPrice(order.getPrice() - 20);
            System.out.println("Your cart is 200 or more, you get a $20 discount");
        }
    }

}