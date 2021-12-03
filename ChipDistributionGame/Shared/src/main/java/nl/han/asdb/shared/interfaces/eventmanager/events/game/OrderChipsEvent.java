package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;



public class OrderChipsEvent extends Event {
    private final UUID buyerUuid;
    private final UUID sellerUuid;
    private final double amount;
    private final double pricePerItem;
    private final short round;

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

    public UUID getSellerUuid() {
        return sellerUuid;
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
