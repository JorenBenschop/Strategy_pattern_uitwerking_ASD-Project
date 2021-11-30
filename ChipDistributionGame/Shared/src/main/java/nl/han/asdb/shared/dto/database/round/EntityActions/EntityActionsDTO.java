package nl.han.asdb.shared.dto.database.round.EntityActions;

import nl.han.asdb.shared.dto.database.round.EntityActions.backlog.BacklogDTO;
import nl.han.asdb.shared.dto.database.round.EntityActions.delivery.DeliveryDTO;
import nl.han.asdb.shared.dto.database.round.EntityActions.order.OrderDTO;

import java.util.List;
import java.util.UUID;

public class EntityActionsDTO {
    private UUID entityId;
    private Enum entityType;
    private int stock;
    private int costs;
    private List<BacklogDTO> backlogs;
    private List<DeliveryDTO> deliveries;
    private List<OrderDTO> orders;

    public EntityActionsDTO() {
    }

    public EntityActionsDTO(UUID entityId, Enum entityType, int stock, int costs, List<BacklogDTO> backlogs, List<DeliveryDTO> deliveries, List<OrderDTO> orders) {
        this.entityId = entityId;
        this.entityType = entityType;
        this.stock = stock;
        this.costs = costs;
        this.backlogs = backlogs;
        this.deliveries = deliveries;
        this.orders = orders;
    }
}
