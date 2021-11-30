package nl.han.asdb.shared.dto.agenthostservice.agentrule.agentaction;

import nl.han.asdb.shared.interfaces.eventmanager.events.game.SellChipsEvent;

import java.util.List;
import java.util.UUID;

public class AgentSellActionDTO implements IAgentActionDTO {
    private UUID sellerUuid;
    private double amount;
    private double pricePerItem;
    private short round;
    private List<SellChipsEvent> sellEventItemList;

    public AgentSellActionDTO() {
    }

    public AgentSellActionDTO(UUID sellerUuid, double amount, double pricePerItem, short round, List<SellChipsEvent> sellEventItemList) {
        this.sellerUuid = sellerUuid;
        this.amount = amount;
        this.pricePerItem = pricePerItem;
        this.round = round;
        this.sellEventItemList = sellEventItemList;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public UUID getUuid() {
        return sellerUuid;
    }

    @Override
    public void setUUID(UUID uuid) {
        this.sellerUuid = uuid;
    }

    @Override
    public short getRound() {
        return this.round;
    }

    @Override
    public void setRound(short round) {
        this.round = round;
    }

    @Override
    public double getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public void setPricePerItem(double price) {
        this.pricePerItem = price;
    }

    public List<SellChipsEvent> getSellEventItemList() {
        return sellEventItemList;
    }

    public void setSellEventItemList(List<SellChipsEvent> sellEventItemList) {
        this.sellEventItemList = sellEventItemList;
    }
}