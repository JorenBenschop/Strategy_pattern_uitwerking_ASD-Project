package nl.han.asdb.shared.dto.agenthostservice.agentrule.agentaction;

import java.util.UUID;

public interface IAgentActionDTO {
    int getAmount();

    void setAmount(int amount);

    UUID getPerson();

    void setUUID(UUID uuid);
}