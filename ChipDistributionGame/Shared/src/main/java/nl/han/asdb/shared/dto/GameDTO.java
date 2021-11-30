package nl.han.asdb.shared.dto;

import java.util.List;

public class GameDTO {
    private int gameId;
    private int numberOfRounds;
    private Enum gameType;
    private int maxTurnTime;
    private boolean isActive;
    private List<RoundDTO> rounds;
}
