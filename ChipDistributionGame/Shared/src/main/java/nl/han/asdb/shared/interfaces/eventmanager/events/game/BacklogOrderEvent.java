package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class BacklogOrderEvent extends Event {
    private UUID sellerUuid;
    private UUID buyerUuid;
    private short backlogAmount;
    private short round;

    public BacklogOrderEvent(){
        this.eventType = EventType.BacklogOrderEvent;
    }

    public BacklogOrderEvent(UUID eventUuid, UUID sellerUuid, UUID buyerUuid, short backlogAmount, short round) {
        super(eventUuid);
        this.sellerUuid = sellerUuid;
        this.buyerUuid = buyerUuid;
        this.backlogAmount = backlogAmount;
        this.round = round;
        this.eventType = EventType.BacklogOrderEvent;
    }

    public UUID getSellerUuid() {
        return sellerUuid;
    }

    public void setSellerUuid(UUID sellerUuid) {
        this.sellerUuid = sellerUuid;
    }

    public UUID getBuyerUuid() {
        return buyerUuid;
    }

    public void setBuyerUuid(UUID buyerUuid) {
        this.buyerUuid = buyerUuid;
    }

    public short getBacklogAmount() {
        return backlogAmount;
    }

    public void setBacklogAmount(short backlogAmount) {
        this.backlogAmount = backlogAmount;
    }

    public short getRound() {
        return round;
    }

    public void setRound(short round) {
        this.round = round;
    }
}
