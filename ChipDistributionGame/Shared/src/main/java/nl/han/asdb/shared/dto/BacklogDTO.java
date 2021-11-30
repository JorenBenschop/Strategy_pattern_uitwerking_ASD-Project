package nl.han.asdb.shared.dto;

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
}
