package domain.model;

public class PricingService {

    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

}