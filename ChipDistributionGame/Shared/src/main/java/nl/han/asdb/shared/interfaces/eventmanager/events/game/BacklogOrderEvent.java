package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

public class BacklogOrderEvent extends Event {
    private String sellerUuid;
    private String buyerUuid;
    private short backlogAmount;
    private short round;

    public String getSellerUuid() {
        return sellerUuid;
    }

    public void setSellerUuid(String sellerUuid) {
        this.sellerUuid = sellerUuid;
    }

    public String getBuyerUuid() {
        return buyerUuid;
    }

    public void setBuyerUuid(String buyerUuid) {
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
