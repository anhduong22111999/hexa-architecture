package application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import application.dto.OrderResult;
import application.dto.PlaceOrderCommand;
import application.port.in.PlaceOrderUseCase;
import application.port.out.OrderRepository;
import domain.model.Order;
import domain.model.PricingService;

@Service
public class PlaceOrderService
        implements PlaceOrderUseCase {

    private final OrderRepository orderRepository;

    public PlaceOrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderResult placeOrder(PlaceOrderCommand command) {

        PricingService pricingService =
                new PricingService();

        double total =
                pricingService.calculateTotal(
                        command.getPrice(),
                        command.getQuantity());

        Order order =
                new Order(UUID.randomUUID().toString(),
                        total);

        Order savedOrder =
                orderRepository.save(order);

        return new OrderResult(
                savedOrder.getOrderId(),
                savedOrder.getTotal());
    }
}