package nl.han.asdb.shared.interfaces.gameinfoprovider;

import java.util.UUID;

public interface IActiveGameInfoProvider {
    int getCurrentRoundNumber();
    int getStockOfEntityByEntityIdAndRoundNumber(UUID entityId, int roundNumber);
    int getTotalAmountOfDeliveryByEntityIdAndRoundNumber(UUID entityId, int roundNumber);
    int getTotalAmountOfBacklogByEntityIdAndRoundNumber(UUID entityId, int roundNumber);
    int getTotalAmountOfOrderByEntityIdAndRoundNumber(UUID entityId, int roundNumber);
}
