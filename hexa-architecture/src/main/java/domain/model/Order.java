package domain.model;

public class Order {

    private String orderId;
    private double total;

    public Order(String orderId, double total) {
        this.orderId = orderId;
        this.total = total;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getTotal() {
        return total;
    }
}