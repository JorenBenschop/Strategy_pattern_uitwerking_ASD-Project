package nl.han.asdb.shared.dto;

import java.util.List;

public class RoundDTO {
    private int gameId;
    private int roundNumber;
    private List<EntityStatisticsDTO> entityStatistics;
    private List<EntityActionsDTO> transactions;
}
