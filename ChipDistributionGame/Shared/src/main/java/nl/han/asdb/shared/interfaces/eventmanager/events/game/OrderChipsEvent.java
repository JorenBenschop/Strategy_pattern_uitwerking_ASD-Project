package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;



public class OrderChipsEvent extends Event {
    private final UUID buyerUuid;
    private final UUID sellerUuid;
    private final short orderAmount;
    private final double pricePerItem;
    private final short round;

    public OrderChipsEvent(UUID eventUuid, UUID buyerUuid, UUID sellerUuid, short orderAmount, double pricePerItem, short round) {
        super(eventUuid);
        this.buyerUuid = buyerUuid;
        this.sellerUuid = sellerUuid;
        this.orderAmount = orderAmount;
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

    public short getOrderAmount() {
        return orderAmount;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public short getRound() {
        return round;
    }
}
