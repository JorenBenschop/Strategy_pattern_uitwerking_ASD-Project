package nl.han.asdb.shared.dto.database.round.EntityActions.delivery;

import java.util.UUID;

public class DeliveryDTO {
    private UUID receiverId;
    private int amount;
    private int amountAsked;

    public DeliveryDTO() {
    }

    public DeliveryDTO(UUID receiverId, int amount, int amountAsked) {
        this.receiverId = receiverId;
        this.amount = amount;
        this.amountAsked = amountAsked;
    }
}
