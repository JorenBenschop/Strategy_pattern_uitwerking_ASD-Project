package nl.han.asdb.shared.dto.agenthostservice.agentrule.agentaction;

import java.util.UUID;

public class AgentBuyActionDTO implements IAgentActionDTO {
    private UUID buyerUuid;
    private int amount;

    public AgentBuyActionDTO() {
    }

    public AgentBuyActionDTO(UUID buyerUuid, int amount) {
        this.buyerUuid = buyerUuid;
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public UUID getPerson() {
        return buyerUuid;
    }

    @Override
    public void setUUID(UUID uuid) {
        this.buyerUuid = uuid;
    }
}
