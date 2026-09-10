package application.dto;

public class OrderResult {

    private String orderId;
    private double total;

    public OrderResult(String orderId, double total) {
        this.orderId = orderId;
        this.total = total;
    }

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

    // getter
    
}