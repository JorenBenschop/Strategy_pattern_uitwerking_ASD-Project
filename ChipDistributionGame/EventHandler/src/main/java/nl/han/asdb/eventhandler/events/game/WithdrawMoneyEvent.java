package nl.han.asdb.eventhandler.events.game;


public class WithdrawMoneyEvent {
    private String TargetUUID;
    private short Amount;
    private short Round;

    public String getTargetUUID() {
        return TargetUUID;
    }

    public void setTargetUUID(String targetUUID) {
        this.TargetUUID = targetUUID;
    }

    public short getAmount() {
        return Amount;
    }

    public void setAmount(short amount) {
        this.Amount = amount;
    }

    public short getRound() {
        return Round;
    }

    public void setRound(short round) {
        this.Round = round;
    }
}
