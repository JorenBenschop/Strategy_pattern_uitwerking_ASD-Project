package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import java.util.UUID;

public class OrderChipsEvent {
    private UUID uuid;
    private UUID sellerUuid;
    private double amount;
    private double pricePerItem;
    private short round;

    public OrderChipsEvent(){}

    public OrderChipsEvent(UUID uuid, UUID sellerUuid, double amount, double pricePerItem, short round) {
        this.uuid = uuid;
        this.sellerUuid = sellerUuid;
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

    public UUID getSellerUuid() {
        return sellerUuid;
    }

    public void setSellerUuid(UUID sellerUuid) {
        this.sellerUuid = sellerUuid;
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
