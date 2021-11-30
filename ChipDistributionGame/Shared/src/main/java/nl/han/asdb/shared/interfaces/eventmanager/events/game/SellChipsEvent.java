package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SellChipsEvent extends Event {
    private UUID sellerUuid;
    private UUID buyerUuid;
    private double amount;
    private double pricePerItem;
    private short round;
    private List<SellChipsEvent> sellEventItemList;

    public SellChipsEvent(){
        this.eventType = EventType.SellChipsEvent;
    }

    public SellChipsEvent(UUID eventUuid, UUID sellerUuid, UUID buyerUuid, double amount, double pricePerItem, short round) {
        super(eventUuid);
        this.sellerUuid = sellerUuid;
        this.buyerUuid = buyerUuid;
        this.amount = amount;
        this.pricePerItem = pricePerItem;
        this.round = round;
        this.sellEventItemList = new ArrayList<>();
        this.eventType = EventType.SellChipsEvent;

    }

    public UUID getSellerUuid() {
        return sellerUuid;
    }

    public void setSellerUuid(UUID sellerUuid) {
        this.sellerUuid = sellerUuid;
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
