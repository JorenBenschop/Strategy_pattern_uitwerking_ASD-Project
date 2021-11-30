package nl.han.asdb.shared.dto.agenthostservice.agentrule.agentaction;

import java.util.UUID;

public class AgentSellActionDTO implements IAgentActionDTO {
    private UUID sellerUuid;
    private int amount;

    public AgentSellActionDTO(){}

    public AgentSellActionDTO(UUID sellerUuid, int amount){
        this.sellerUuid = sellerUuid;
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
        return sellerUuid;
    }

    @Override
    public void setUUID(UUID uuid) {
        this.sellerUuid = uuid;
    }
}