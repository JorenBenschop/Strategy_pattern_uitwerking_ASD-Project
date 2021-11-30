package nl.han.asdb.shared.interfaces.database;

import nl.han.asdb.shared.dto.agenthostservice.AgentDTO;
import nl.han.asdb.shared.dto.database.GameDTO;
import nl.han.asdb.shared.dto.database.PlayerDTO;
import nl.han.asdb.shared.dto.database.RoundDTO;

import java.util.ArrayList;
import java.util.UUID;

public interface IDatabase {
    ArrayList<GameDTO> getPlayedGames();
    GameDTO getGameHistory(int gameId);
    RoundDTO getRound(int roundNumber, int gameId);
    RoundDTO getLastRound(int gameId);
    AgentDTO getPlayerAgent(UUID playerId);
    AgentDTO getStandardAgent();
    GameDTO createGame();
    void nextRound();
    void addTransactionToRound(
            int gameId,
            RoundDTO round,
            UUID sender,
            UUID receiver,
            int amount
    );
    void addAgent(UUID player, AgentDTO agent);
    void addPlayer(PlayerDTO player);
}
