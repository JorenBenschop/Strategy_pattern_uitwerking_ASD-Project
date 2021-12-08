package nl.han.asdb.shared.dto.database.game.round.EntityActions.order;

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

    public UUID getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(UUID supplierId) {
        this.supplierId = supplierId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}


