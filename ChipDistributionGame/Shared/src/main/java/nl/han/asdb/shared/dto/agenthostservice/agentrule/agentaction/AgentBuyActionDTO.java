package nl.han.asdb.shared.dto.agenthostservice.agentrule.agentaction;

import java.util.UUID;

public class AgentBuyActionDTO implements IAgentActionDTO {
    private UUID buyerUuid;
    public double amount;
    private double pricePerItem;
    private short round;


    public AgentBuyActionDTO(UUID buyerUuid, double amount, double pricePerItem, short round) {
        this.buyerUuid = buyerUuid;
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
        return buyerUuid;
    }

    @Override
    public void setUUID(UUID uuid) {
        this.buyerUuid = uuid;
    }

    @Override
    public short getRound() {
        return round;
    }

    @Override
    public void setRound(short round) {
        this.round = round;
    }

    @Override
    public double getPricePerItem() {
        return this.pricePerItem;
    }

    @Override
    public void setPricePerItem(double price) {
        this.pricePerItem = price;
    }


}
