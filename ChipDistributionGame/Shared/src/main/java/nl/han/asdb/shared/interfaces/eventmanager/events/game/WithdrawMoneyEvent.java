package nl.han.asdb.shared.interfaces.eventmanager.events.game;


import java.util.UUID;

public class WithdrawMoneyEvent {
    private UUID targetUuid;
    private double amount;
    private short round;

    public WithdrawMoneyEvent(){}

    public WithdrawMoneyEvent(UUID targetUuid, double amount, short round) {
        this.targetUuid = targetUuid;
        this.amount = amount;
        this.round = round;
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
