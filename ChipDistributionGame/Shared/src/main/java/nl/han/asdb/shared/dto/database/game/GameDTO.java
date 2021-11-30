package nl.han.asdb.shared.dto.database.game;

import nl.han.asdb.shared.dto.database.round.RoundDTO;

import java.util.List;

public class GameDTO {
    private int gameId;
    private int numberOfRounds;
    private Enum gameType;
    private int maxTurnTime;
    private boolean isActive;
    private List<RoundDTO> rounds;

    public GameDTO() {
    }

    public GameDTO(int gameId, int numberOfRounds, Enum gameType, int maxTurnTime, boolean isActive, List<RoundDTO> rounds) {
        this.gameId = gameId;
        this.numberOfRounds = numberOfRounds;
        this.gameType = gameType;
        this.maxTurnTime = maxTurnTime;
        this.isActive = isActive;
        this.rounds = rounds;
    }
}
