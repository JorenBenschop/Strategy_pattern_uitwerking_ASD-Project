package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

import java.util.UUID;

import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

public class OrderChipsEvent extends Event {
    private UUID buyerUuid;
    private UUID sellerUuid;
    private double amount;
    private double pricePerItem;
    private short round;

    public OrderChipsEvent(){
        this.eventType = EventType.OrderChipsEvent;
    }

    public OrderChipsEvent(UUID eventUuid, UUID buyerUuid, UUID sellerUuid, double amount, double pricePerItem, short round) {
        super(eventUuid);
        this.buyerUuid = buyerUuid;
        this.sellerUuid = sellerUuid;
        this.amount = amount;
        this.pricePerItem = pricePerItem;
        this.round = round;
        this.eventType = EventType.OrderChipsEvent;
    }

    public UUID getBuyerUuid() {
        return buyerUuid;
    }

    public void setBuyerUuid(UUID buyerUuid) {
        this.buyerUuid = buyerUuid;
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

    public void setAmount(double amount) {
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
