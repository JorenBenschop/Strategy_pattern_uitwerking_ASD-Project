package nl.han.asdb.shared.dto.gameservice.turn.entity.backlog;

import java.util.UUID;

public class BacklogDTO {

    private UUID entityIDReciever;
    private int amountOfBacklog;

    public BacklogDTO() {
    }

    public BacklogDTO(UUID entityIDReciever, int amountOfBacklog) {
        this.entityIDReciever = entityIDReciever;
        this.amountOfBacklog = amountOfBacklog;
    }

    public UUID getEntityIDReciever() {
        return entityIDReciever;
    }

    public void setEntityIDReciever(UUID entityIDReciever) {
        this.entityIDReciever = entityIDReciever;
    }

    public int getAmountOfBacklog() {
        return amountOfBacklog;
    }

    public void setAmountOfBacklog(int amountOfBacklog) {
        this.amountOfBacklog = amountOfBacklog;
    }
}
