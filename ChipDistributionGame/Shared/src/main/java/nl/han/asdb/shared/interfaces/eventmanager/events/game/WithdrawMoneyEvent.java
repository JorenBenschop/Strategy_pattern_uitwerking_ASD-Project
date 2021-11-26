package nl.han.asdb.shared.interfaces.eventmanager.events.game;


public class WithdrawMoneyEvent {
    private String targetUuid;
    private double amount;
    private short round;

    public String getTargetUuid() {
        return targetUuid;
    }

    public void setTargetUuid(String targetUuid) {
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
