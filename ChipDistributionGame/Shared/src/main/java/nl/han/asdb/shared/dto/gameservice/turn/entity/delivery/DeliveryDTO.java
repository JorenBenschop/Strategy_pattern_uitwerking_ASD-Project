package nl.han.asdb.shared.dto.gameservice.turn.entity.delivery;

import java.util.UUID;

public class DeliveryDTO {

    private int amountDelivered;
    //this is the entity that recieves the delivery
    private UUID recieverOfDelivery;
    private int amountOrdered;


    public DeliveryDTO() {
    }

    public DeliveryDTO(int amountDelivered, UUID recieverOfDelivery, int amountOrdered) {
        this.amountDelivered = amountDelivered;
        this.recieverOfDelivery = recieverOfDelivery;
        this.amountOrdered = amountOrdered;
    }

    public int getAmountDelivered() {
        return amountDelivered;
    }

    public void setAmountDelivered(int amountDelivered) {
        this.amountDelivered = amountDelivered;
    }

    public UUID getRecieverOfDelivery() {
        return recieverOfDelivery;
    }

    public void setRecieverOfDelivery(UUID recieverOfDelivery) {
        this.recieverOfDelivery = recieverOfDelivery;
    }

    public int getAmountOrdered() {
        return amountOrdered;
    }

    public void setAmountOrdered(int amountOrdered) {
        this.amountOrdered = amountOrdered;
    }
}
