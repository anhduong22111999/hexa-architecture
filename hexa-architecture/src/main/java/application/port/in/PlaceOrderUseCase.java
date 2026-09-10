package application.port.in;

import application.dto.OrderResult;
import application.dto.PlaceOrderCommand;

public interface PlaceOrderUseCase {
	OrderResult placeOrder(PlaceOrderCommand command);
}
