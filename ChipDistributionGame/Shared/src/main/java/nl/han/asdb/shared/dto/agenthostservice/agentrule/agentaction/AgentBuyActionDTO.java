package nl.han.asdb.shared.dto.agenthostservice.agentrule.agentaction;

import java.util.UUID;

public class AgentBuyActionDTO implements IAgentActionDTO {
    private UUID buyerUuid;
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
        return this.buyerUuid;
    }

    @Override
    public void setUUID(UUID uuid) {
        this.buyerUuid = uuid;
    }
}
