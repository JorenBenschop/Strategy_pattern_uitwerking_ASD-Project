package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class SellChipsEvent extends Event {
    private final UUID sellerUuid;
    private final UUID buyerUuid;
    private final double amount;
    private final double pricePerItem;
    private final short round;

    public SellChipsEvent(UUID eventUuid, UUID sellerUuid, UUID buyerUuid, double amount, double pricePerItem, short round) {
        super(eventUuid);
        this.sellerUuid = sellerUuid;
        this.buyerUuid = buyerUuid;
        this.amount = amount;
        this.pricePerItem = pricePerItem;
        this.round = round;
        this.eventType = EventType.SellChipsEvent;
    }

    public UUID getSellerUuid() {
        return sellerUuid;
    }

    public UUID getBuyerUuid() {
        return buyerUuid;
    }

    public double getAmount() {
        return amount;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public short getRound() {
        return round;
    }
}
