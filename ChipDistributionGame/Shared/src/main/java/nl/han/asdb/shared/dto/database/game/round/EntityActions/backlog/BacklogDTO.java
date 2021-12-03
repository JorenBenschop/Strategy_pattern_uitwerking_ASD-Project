package nl.han.asdb.shared.dto.database.game.round.EntityActions.backlog;

import java.util.UUID;

public class BacklogDTO {
    private UUID receiverId;
    private int amount;

    public BacklogDTO() {
    }

    public BacklogDTO(UUID receiverId, int amount) {
        this.receiverId = receiverId;
        this.amount = amount;
    }

    public UUID getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(UUID receiverId) {
        this.receiverId = receiverId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
