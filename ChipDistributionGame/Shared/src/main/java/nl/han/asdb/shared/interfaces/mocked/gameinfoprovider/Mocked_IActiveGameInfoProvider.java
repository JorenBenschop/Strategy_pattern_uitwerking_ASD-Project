package nl.han.asdb.shared.interfaces.mocked.gameinfoprovider;

import nl.han.asdb.shared.interfaces.gameinfoprovider.IActiveGameInfoProvider;
import java.util.UUID;

public class Mocked_IActiveGameInfoProvider implements IActiveGameInfoProvider {
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
    public int getTotalAmountOfBacklogByEntityIdAndRoundNumber(UUID entityId, int roundNumber) {
        return 0;
    }

    @Override
    public int getTotalAmountOfOrderByEntityIdAndRoundNumber(UUID entityId, int roundNumber) {
        return 0;
    }
}
