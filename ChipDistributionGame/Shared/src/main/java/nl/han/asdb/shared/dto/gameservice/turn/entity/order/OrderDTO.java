package nl.han.asdb.shared.dto.gameservice.turn.entity.order;

import java.util.UUID;

public class OrderDTO {

    private int orderAmount;
    //this is the entity that recieves the order
    private UUID orderSendTo;

    public OrderDTO() {
    }

    public OrderDTO(int orderAmount, UUID orderSendTo) {
        this.orderAmount = orderAmount;
        this.orderSendTo = orderSendTo;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public UUID getOrderSendTo() {
        return orderSendTo;
    }

    public void setOrderSendTo(UUID orderSendTo) {
        this.orderSendTo = orderSendTo;
    }
}
