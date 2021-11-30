package nl.han.asdb.shared.dto.database.round.EntityActions.order;

import java.util.UUID;

public class OrderDTO {
    private UUID supplierId;
    private int amount;

    public OrderDTO() {
    }

    public OrderDTO(UUID supplierId, int amount) {
        this.supplierId = supplierId;
        this.amount = amount;
    }
}


