package nl.han.asdb.eventhandler.events.game;


public class WithdrawMoneyEvent {
    private String TargetUUID;

    public String getTargetUUID() {
        return TargetUUID;
    }

    public void setTargetUUID(String targetUUID) {
        TargetUUID = targetUUID;
    }

    public short getAmount() {
        return Amount;
    }

    public void setAmount(short amount) {
        Amount = amount;
    }

    public short getRound() {
        return Round;
    }

    public void setRound(short round) {
        Round = round;
    }

    private short Amount;
    private short Round;
}
