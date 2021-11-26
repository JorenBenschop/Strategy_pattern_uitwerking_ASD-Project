package nl.han.asdb.shared.interfaces.gameinfoprovider;

import nl.han.asdb.shared.dto.gameservice.turn.TurnDTO;

import java.util.List;
import java.util.UUID;

public interface IGameInfoProvider {
    boolean isGameActive();
    UUID getCurrentGameID();
    List<TurnDTO> getTurns();
    TurnDTO getTurnByTurnNumber(int turnNumber);
    int getCurrentTurnNumber();
    TurnDTO getCurrentTurn();
}
