package application.port.out;

import domain.model.Order;

public interface OrderRepository {
	Order save(Order order);
}
