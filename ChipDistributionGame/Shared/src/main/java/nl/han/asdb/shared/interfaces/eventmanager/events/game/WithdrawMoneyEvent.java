package nl.han.asdb.shared.interfaces.eventmanager.events.game;


import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class WithdrawMoneyEvent extends Event {
    private UUID targetUuid;
    private double amount;
    private short round;

    public WithdrawMoneyEvent(){
        this.eventType = EventType.WithdrawMoneyEvent;
    }

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

    public void setTargetUuid(UUID targetUuid) {
        this.targetUuid = targetUuid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(short amount) {
        this.amount = amount;
    }

    public short getRound() {
        return round;
    }

    public void setRound(short round) {
        this.round = round;
    }
}
