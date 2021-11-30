package nl.han.asdb.shared.dto.agenthostservice.agentrule.agentaction;

import java.util.UUID;

public class AgentSellActionDTO implements IAgentActionDTO {
    private UUID sellerUuid;
    private int amount;

    @Override
    public int getAmount() {
        return this.amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public UUID getPerson() {
        return this.sellerUuid;
    }

    @Override
    public void setUUID(UUID uuid) {
        this.sellerUuid = uuid;
    }
}