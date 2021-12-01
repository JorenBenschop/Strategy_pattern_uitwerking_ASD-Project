package nl.han.asdb.shared.dto.agenthostservice.agentrule.agentaction;

import java.util.UUID;

public class AgentSellActionDTO implements IAgentActionDTO {
    private UUID sellerUuid;
    private double amount;
    private double pricePerItem;
    private short round;

    public AgentSellActionDTO() {
    }

    public AgentSellActionDTO(UUID sellerUuid, double amount, double pricePerItem, short round) {
        this.sellerUuid = sellerUuid;
        this.amount = amount;
        this.pricePerItem = pricePerItem;
        this.round = round;
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
}