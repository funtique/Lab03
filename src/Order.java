import java.util.ArrayList;

public class Order {

    private int quantity;
    private int price;

    private static int number;

    private int id;

    private int shippingCost = 10;
    ArrayList<String> items;
    ArrayList<OrderObserver> observers;

    public Order(int quantity, int price){
        this.id = Order.number++;
        this.price = price;
        this.quantity = quantity;
        this.items = new ArrayList<String>();
        this.observers = new ArrayList<OrderObserver>();
        this.attach(new PriceObserver());
        this.attach(new QuantityObserver());
    }

    public int getId() {
        return id;
    }
    public int getShippingCost() {
        return this.shippingCost;
    }

    public void setShippingCost(int x) {
        this.shippingCost = x;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getPrice() {
        return this.price;
    }

    public void setQuantity(int x) {
        this.quantity = x;
    }

    public void setPrice(int x) {
        this.price = x;
    }

    public void attach(OrderObserver observer) {
        this.observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        this.observers.remove(observer);
    }

    public double getTotalPrice() {
        for (OrderObserver obs : this.observers) {
            obs.update(this);
        }
        return this.price;
    }

    public int getCount() {
        return this.quantity;
    }

    public String toString() {
        return "Order id : " + this.getId() + " | Quantity : " + this.quantity + " | Price : " + this.getTotalPrice();
    }


}