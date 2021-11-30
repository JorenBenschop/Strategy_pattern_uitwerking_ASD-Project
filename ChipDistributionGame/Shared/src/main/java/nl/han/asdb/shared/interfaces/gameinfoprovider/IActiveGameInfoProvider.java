package nl.han.asdb.shared.interfaces.gameinfoprovider;

import nl.han.asdb.shared.dto.gameservice.turn.TurnDTO;

import java.util.List;
import java.util.UUID;

public interface IActiveGameInfoProvider {
    int getCurrentRoundNumber();
    int getStockOfEntityByEntityIdAndRoundNumber(UUID entityId, int roundNumber);
    int getTotalAmountOfDeliveryByEntityIdAndRoundNumber(UUID entityId, int roundNumber);
    int getTotalAmountOfBacklogByEntityIdAndRoundNumber(UUID entityId, int roundNumber);
    int getTotalAmountOfOrderByEntityIdAndRoundNumber(UUID entityId, int roundNumber);
}
