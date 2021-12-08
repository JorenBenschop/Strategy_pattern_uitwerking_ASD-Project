package nl.han.asdb.shared.interfaces.gameinfoprovider;

import java.util.List;
import java.util.UUID;

public interface IActiveGameInfoProvider {
    List<UUID> getEntitiesSupplier(UUID entityID);
    int getCurrentRoundNumber();
    int getStockOfEntityByEntityIdAndRoundNumber(UUID entityId, int roundNumber);
    int getTotalAmountOfDeliveryByEntityIdAndRoundNumber(UUID entityId, int roundNumber);
    int getAmountOfDeliveryForGivenReceiverEntityIdByEntityIdAndRoundNumber(UUID entityId, int roundNumber, UUID receiverEntityId);
    int getTotalAmountOfBacklogByEntityIdAndRoundNumber(UUID entityId, int roundNumber);
    int getAmountOfBacklogForAGivenReceiverEntityIdByEntityIdAndRoundNumber(UUID entityId, int roundNumber, UUID receiverEntityId);
    int getTotalAmountOfOrderByEntityIdAndRoundNumber(UUID entityId, int roundNumber);
    int getAmountOrderedBySupplierForEntityIdAndRoundNumber(UUID entityId, int roundNumber, UUID supplierID);
}
