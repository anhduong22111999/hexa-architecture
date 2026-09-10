package adapter.out.persistence;

import org.springframework.stereotype.Component;

import application.port.out.OrderRepository;
import domain.model.Order;

@Component
public class InMemoryOrderAdapter
        implements OrderRepository {

    @Override
    public Order save(Order order) {

        System.out.println(
                "Save Order = "
                + order.getOrderId());

        return order;
    }
}
