package nl.han.asdb.eventhandler.events.game;

import nl.han.asdb.eventhandler.events.Event;

public class BacklogOrderEvent extends Event {
    private String SellerUUID;
    private String BuyerUUID;
    private short BacklogAmount;
    private short Round;

    public String getSellerUUID() {
        return SellerUUID;
    }

    public void setSellerUUID(String sellerUUID) {
        this.SellerUUID = sellerUUID;
    }

    public String getBuyerUUID() {
        return BuyerUUID;
    }

    public void setBuyerUUID(String buyerUUID) {
        this.BuyerUUID = buyerUUID;
    }

    public short getBacklogAmount() {
        return BacklogAmount;
    }

    public void setBacklogAmount(short backlogAmount) {
        this.BacklogAmount = backlogAmount;
    }

    public short getRound() {
        return Round;
    }

    public void setRound(short round) {
        this.Round = round;
    }
}
