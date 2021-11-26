package nl.han.asdb.shared.interfaces.mocked.database;

import nl.han.asdb.shared.dto.agenthostservice.AgentDTO;
import nl.han.asdb.shared.dto.database.GameDTO;
import nl.han.asdb.shared.dto.database.PlayerDTO;
import nl.han.asdb.shared.dto.database.RoundDTO;
import nl.han.asdb.shared.interfaces.database.IDatabase;

import java.util.ArrayList;
import java.util.UUID;

public class Mocked_IDatabase implements IDatabase {
    @Override
    public ArrayList<GameDTO> getPlayedGames() {
        return null;
    }

    @Override
    public GameDTO getGameHistory(int gameId) {
        return null;
    }

    @Override
    public RoundDTO getRound(int roundNumber, int gameId) {
        return null;
    }

    @Override
    public RoundDTO getLastRound(int gameId) {
        return null;
    }

    @Override
    public AgentDTO getPlayerAgent(UUID playerId) {
        return null;
    }

    @Override
    public AgentDTO getStandardAgent() {
        return null;
    }

    @Override
    public GameDTO createGame() {
        return null;
    }

    @Override
    public void nextRound() {

    }

    @Override
    public void addTransactionToRound(int gameId, RoundDTO round, UUID sender, UUID receiver, int amount) {

    }

    @Override
    public void addAgent(UUID player, AgentDTO agent) {

    }

    @Override
    public void addPlayer(PlayerDTO player) {

    }
}
