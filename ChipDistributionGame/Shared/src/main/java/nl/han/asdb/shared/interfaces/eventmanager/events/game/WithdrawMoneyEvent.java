package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class WithdrawMoneyEvent extends Event {
    private final UUID entityId;
    private final double priceAmount;
    private final short round;

    public WithdrawMoneyEvent(UUID eventUuid, UUID entityId, double priceAmount, short round) {
        super(eventUuid);
        this.entityId = entityId;
        this.priceAmount = priceAmount;
        this.round = round;
        this.eventType = EventType.WithdrawMoneyEvent;
    }

    public UUID getEntityId() {
        return entityId;
    }

    public double getPriceAmount() {
        return priceAmount;
    }

    public short getRound() {
        return round;
    }
}
