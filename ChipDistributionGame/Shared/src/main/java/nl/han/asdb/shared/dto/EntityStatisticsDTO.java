package nl.han.asdb.shared.dto;

import java.util.List;
import java.util.UUID;

public class EntityStatisticsDTO {
    private UUID entityId;
    private Enum entityType;
    private int roundNumber;
    private int stock;
    private int costs;
    private List<BacklogDTO> backlogs;

}
