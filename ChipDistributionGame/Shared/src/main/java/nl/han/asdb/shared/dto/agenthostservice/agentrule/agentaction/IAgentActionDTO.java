package nl.han.asdb.shared.dto.agenthostservice.agentrule.agentaction;

import java.util.UUID;

public interface IAgentActionDTO {
    double getAmount();

    void setAmount(double amount);

    UUID getBuyerUuid();

    void setBuyerUuid(UUID uuid);

    UUID getSellerUuid();

    void setSellerUuid(UUID uuid);

    short getRound();

    void setRound(short round);

    double getPricePerItem();

    void setPricePerItem(double price);
}