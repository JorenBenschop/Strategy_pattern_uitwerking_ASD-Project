package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class WithdrawMoneyEvent extends Event {
    private final UUID targetUuid;
    private final double amount;
    private final short round;

    public WithdrawMoneyEvent(UUID eventUuid, UUID targetUuid, double amount, short round) {
        super(eventUuid);
        this.targetUuid = targetUuid;
        this.amount = amount;
        this.round = round;
        this.eventType = EventType.WithdrawMoneyEvent;
    }

    public UUID getTargetUuid() {
        return targetUuid;
    }

    public double getAmount() {
        return amount;
    }

    public short getRound() {
        return round;
    }
}
