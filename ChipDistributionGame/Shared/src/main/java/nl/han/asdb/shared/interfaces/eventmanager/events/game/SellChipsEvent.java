package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import java.util.UUID;

public class SellChipsEvent {
    private UUID uuid;
    private UUID buyerUuid;
    private double amount;
    private double pricePerItem;
    private short round;

    public SellChipsEvent(){
    }

    public SellChipsEvent(UUID uuid, UUID buyerUuid, double amount, double pricePerItem, short round) {
        this.uuid = uuid;
        this.buyerUuid = buyerUuid;
        this.amount = amount;
        this.pricePerItem = pricePerItem;
        this.round = round;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getBuyerUuid() {
        return buyerUuid;
    }

    public void setBuyerUuid(UUID buyerUuid) {
        this.buyerUuid = buyerUuid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(short amount) {
        this.amount = amount;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(short pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public short getRound() {
        return round;
    }

    public void setRound(short round) {
        this.round = round;
    }
}
