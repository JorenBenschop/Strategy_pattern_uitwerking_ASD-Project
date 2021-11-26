package nl.han.asdb.shared.interfaces.mocked.gameinfoprovider;

import nl.han.asdb.shared.dto.gameservice.turn.TurnDTO;
import nl.han.asdb.shared.interfaces.gameinfoprovider.IGameInfoProvider;

import java.util.List;
import java.util.UUID;

public class Mocked_IGameInfoProvider implements IGameInfoProvider {
    @Override
    public boolean isGameActive() {
        return false;
    }

    @Override
    public UUID getCurrentGameID() {
        return null;
    }

    @Override
    public List<TurnDTO> getTurns() {
        return null;
    }

    @Override
    public TurnDTO getTurnByTurnNumber(int turnNumber) {
        return null;
    }

    @Override
    public int getCurrentTurnNumber() {
        return 0;
    }

    @Override
    public TurnDTO getCurrentTurn() {
        return null;
    }
}
