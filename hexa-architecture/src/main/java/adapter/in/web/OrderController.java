package adapter.in.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.dto.OrderResult;
import application.dto.PlaceOrderCommand;
import application.port.in.PlaceOrderUseCase;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final PlaceOrderUseCase useCase;

    public OrderController(
            PlaceOrderUseCase useCase) {

        this.useCase = useCase;
    }

    @PostMapping
    public ResponseEntity<OrderResult> placeOrder(
            @RequestBody PlaceOrderCommand cmd) {

        OrderResult result =
                useCase.placeOrder(cmd);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(result);
    }
}
