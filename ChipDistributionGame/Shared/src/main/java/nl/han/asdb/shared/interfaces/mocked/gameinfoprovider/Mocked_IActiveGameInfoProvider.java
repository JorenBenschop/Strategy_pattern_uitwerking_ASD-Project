package nl.han.asdb.shared.interfaces.mocked.gameinfoprovider;

import nl.han.asdb.shared.interfaces.gameinfoprovider.IActiveGameInfoProvider;

import java.util.List;
import java.util.UUID;

public class Mocked_IActiveGameInfoProvider implements IActiveGameInfoProvider {
    @Override
    public List<UUID> getEntitiesSupplier(UUID entityID) {
        return null;
    }

    @Override
    public int getCurrentRoundNumber() {
        return 0;
    }

    @Override
    public int getStockOfEntityByEntityIdAndRoundNumber(UUID entityId, int roundNumber) {
        return 0;
    }

    @Override
    public int getTotalAmountOfDeliveryByEntityIdAndRoundNumber(UUID entityId, int roundNumber) {
        return 0;
    }

    @Override
    public int getAmountOfDeliveryForGivenReceiverEntityIdByEntityIdAndRoundNumber(UUID entityId, int roundNumber, UUID receiverEntityId) {
        return 0;
    }

    @Override
    public int getTotalAmountOfBacklogByEntityIdAndRoundNumber(UUID entityId, int roundNumber) {
        return 0;
    }

    @Override
    public int getAmountOfBacklogForAGivenReceiverEntityIdByEntityIdAndRoundNumber(UUID entityId, int roundNumber, UUID receiverEntityId) {
        return 0;
    }

    @Override
    public int getTotalAmountOfOrderByEntityIdAndRoundNumber(UUID entityId, int roundNumber) {
        return 0;
    }

    @Override
    public int getAmountOrderedBySupplierForEntityIdAndRoundNumber(UUID entityId, int roundNumber, UUID supplierID) {
        return 0;
    }
}
