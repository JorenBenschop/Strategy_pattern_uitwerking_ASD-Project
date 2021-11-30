package nl.han.asdb.shared.dto;

import java.util.List;
import java.util.UUID;

public class EntityActionsDTO {
    private UUID entityId;
    private Enum entityType;
    private int roundNumber;
    private int stock;
    private int costs;
    private List<BacklogDTO> backlogs;
    private List<DeliveryDTO> deliveries;
    private List<OrderDTO> orders;

    public EntityActionsDTO() {
    }

    public EntityActionsDTO(UUID entityId, Enum entityType, int roundNumber, int stock, int costs, List<BacklogDTO> backlogs, List<DeliveryDTO> deliveries, List<OrderDTO> orders) {
        this.entityId = entityId;
        this.entityType = entityType;
        this.roundNumber = roundNumber;
        this.stock = stock;
        this.costs = costs;
        this.backlogs = backlogs;
        this.deliveries = deliveries;
        this.orders = orders;
    }
}
