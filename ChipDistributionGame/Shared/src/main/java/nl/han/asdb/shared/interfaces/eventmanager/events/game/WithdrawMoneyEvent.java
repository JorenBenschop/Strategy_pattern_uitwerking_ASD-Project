package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class WithdrawMoneyEvent extends Event {
    private final UUID entityId;
    private final double amount;
    private final short round;

    public WithdrawMoneyEvent(UUID eventUuid, UUID entityId, double amount, short round) {
        super(eventUuid);
        this.entityId = entityId;
        this.amount = amount;
        this.round = round;
        this.eventType = EventType.WithdrawMoneyEvent;
    }

    public UUID getEntityId() {
        return entityId;
    }

    public double getAmount() {
        return amount;
    }

    public short getRound() {
        return round;
    }
}
