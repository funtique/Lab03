public class Client {

    private Order order;

    public Client() {
        this.order = new Order(0,0);
    }

    public void addToCart(int price, int qtt) {
        this.order.setQuantity(this.order.getQuantity() + qtt);
        this.order.setPrice(this.order.getPrice() + (price * qtt));
    }

    public void removeToCart(int price, int qtt) {
        this.order.setQuantity(this.order.getQuantity() - qtt);
        this.order.setPrice(this.order.getPrice() - (price * qtt));
    }

    public String toString() {
        return order.toString();
        // glouche jtm

    }
}